package co.edu.uptc.analysis;

import co.edu.uptc.model.Dream;

public class SymbolicalAnalysis implements Analysis {
    @Override
    public String analizer(Dream dream) {
        return "Análisis simbólico de: " + dream.getDescription();
    }
}