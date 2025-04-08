package co.edu.uptc.analysis;

import co.edu.uptc.model.Dream;

public interface Analysis {
    void analyze(Dream dream);
    String getType();
}
