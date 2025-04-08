package co.edu.uptc.analysis;

import co.edu.uptc.model.Dream;

public class CognitiveAnalysis extends AbstractAnalysis {
    public CognitiveAnalysis() {
        super("Cognitive");
    }

    @Override
    public void analyze(Dream dream) {
        System.out.println("Cognitive Analysis: Studying thought patterns in → " + dream.getDescription());
    }
}
