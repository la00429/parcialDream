package co.edu.uptc.factorymethod;

import co.edu.uptc.model.Dream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class DreamTemporal implements DreamRepository{
    private final ConcurrentHashMap<String, Dream> temporaryStorage = new ConcurrentHashMap<>();

    @Override
    public void saveDream(Dream dream) {
        temporaryStorage.put(String.valueOf(dream.getId()), dream);
    }

    @Override
    public Optional<Dream> findDreamById(String id) {
        return Optional.ofNullable(temporaryStorage.get(id));
    }

    @Override
    public Dream duplicateDream(String originalDreamId, String newDreamId) {
        Dream original = temporaryStorage.get(originalDreamId);
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
        temporaryStorage.remove(id);
    }

    @Override
    public List<Dream> findAllDreams() {
        return new ArrayList<>(temporaryStorage.values());
    }

    @Override
    public int count() {
        return temporaryStorage.size();
    }

    public void clear() {
        temporaryStorage.clear();
    }
}
