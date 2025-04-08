package co.edu.uptc.analysis;

import co.edu.uptc.model.Dream;

public abstract class AbstractAnalysis implements Analysis {
    protected String type;

    public AbstractAnalysis(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public abstract void analyze(Dream dream);
}