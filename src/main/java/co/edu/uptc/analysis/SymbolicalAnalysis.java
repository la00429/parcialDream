package co.edu.uptc.analysis;

import co.edu.uptc.model.Dream;

public class SymbolicalAnalysis extends AbstractAnalysis {
    public SymbolicalAnalysis() {
        super("Symbolical");
    }

    @Override
    public void analyze(Dream dream) {
        System.out.println("Symbolical Analysis: Interpreting symbols in → " + dream.getDescription());
    }
}
