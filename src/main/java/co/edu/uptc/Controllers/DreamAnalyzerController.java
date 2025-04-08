package co.edu.uptc.controller;

import co.edu.uptc.analysis.Analysis;
import co.edu.uptc.builder.DreamReportBuilder;
import co.edu.uptc.model.Dream;
import co.edu.uptc.model.DreamReport;
import co.edu.uptc.objectpool.AnalyzerPool;

public class DreamAnalyzerController {

    public DreamReport analyzeDream(Dream dream) {
        Analysis analyzer = AnalyzerPool.borrow();
        if (analyzer == null) {
            throw new IllegalStateException("No hay analizadores disponibles.");
        }

        String result = analyzer.analizer(dream);

        DreamReport report = new DreamReportBuilder()
                .withSummary("Resumen generado por: " + analyzer.getClass().getSimpleName())
                .withSymbolicalSection("Descripción: " + dream.getDescription())
                .withGraphicalInsights("Resultado: " + result)
                .build();

        AnalyzerPool.release(analyzer);
        return report;
    }
}
