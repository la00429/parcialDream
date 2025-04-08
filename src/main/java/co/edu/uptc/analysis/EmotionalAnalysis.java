package co.edu.uptc.analysis;

import co.edu.uptc.model.Dream;

public class EmotionalAnalysis extends AbstractAnalysis {
    public EmotionalAnalysis() {
        super("Emotional");
    }

    @Override
    public void analyze(Dream dream) {
        System.out.println("Emotional Analysis: Evaluating emotions in → " + dream.getDescription());
    }
}
