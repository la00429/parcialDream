package co.edu.uptc.factorymethod;
import co.edu.uptc.model.Dream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class DreamHistory implements DreamRepository {
    private final ConcurrentHashMap<String, Dream> dreamsDatabase = new ConcurrentHashMap<>();

    @Override
    public void saveDream(Dream dream) {
        dreamsDatabase.put(String.valueOf(dream.getId()), dream);
    }

    @Override
    public Optional<Dream> findDreamById(String id) {
        return Optional.ofNullable(dreamsDatabase.get(id));
    }

    @Override
    public Dream duplicateDream(String originalDreamId, String newDreamId) {
        Dream original = dreamsDatabase.get(originalDreamId);
        if (original == null) {
            throw new IllegalArgumentException("Sueño original no encontrado: " + originalDreamId);
        }

        Dream duplicated = original.clone();
        duplicated.setDescription("[Copia] " + original.getDescription());
        saveDream(duplicated);
        return duplicated;
    }

    @Override
    public void deleteDream(String id) {
        dreamsDatabase.remove(id);
    }

    @Override
    public List<Dream> findAllDreams() {
        return new ArrayList<>(dreamsDatabase.values());
    }

    @Override
    public int count() {
        return dreamsDatabase.size();

    }
}
