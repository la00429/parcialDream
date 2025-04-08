package co.edu.uptc.prototype;

import java.util.ArrayList;

import co.edu.uptc.model.Dream;

public class DreamListImplementation implements IProtoType<DreamListImplementation> {
    private ArrayList<Dream> dreams = new ArrayList<Dream>();

    @Override
    public DreamListImplementation clone() {
        DreamListImplementation copy = new DreamListImplementation();
        copy.dreams = new ArrayList<>(this.dreams);
        return copy;
    }
    @Override
    public DreamListImplementation deepClone() {
        DreamListImplementation copy = new DreamListImplementation();
        for (Dream dream : this.dreams) {
            copy.dreams.add(dream.deepClone());
        }
        return copy;
    }
    public ArrayList<Dream> getDreams() {
        return dreams;
    }
    public void setDreams(ArrayList<Dream> dreams) {
        this.dreams = dreams;
    }

    
}
