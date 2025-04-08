package co.edu.uptc.analysis;

import co.edu.uptc.model.Dream;

public class StaticalAnalysis extends AbstractAnalysis {
    public StaticalAnalysis() {
        super("Statical");
    }

    @Override
    public void analyze(Dream dream) {
        System.out.println("Statical Analysis: Gathering metrics from → " + dream.getDescription());
    }
}
