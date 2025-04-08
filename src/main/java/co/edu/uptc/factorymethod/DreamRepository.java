package co.edu.uptc.factorymethod;

import co.edu.uptc.model.Dream;

import java.util.List;
import java.util.Optional;

public interface DreamRepository {
    void saveDream(Dream dream);
    Optional<Dream> findDreamById(String id);
    Dream duplicateDream(String originalDreamId, String newDreamId);
    void deleteDream(String id);
    List<Dream> findAllDreams();
    int count();
    
}
