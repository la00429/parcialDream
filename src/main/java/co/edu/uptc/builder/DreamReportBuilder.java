package co.edu.uptc.builder;

import co.edu.uptc.model.DreamReport;

public class DreamReportBuilder {
    private DreamReport dreamReport;

    public DreamReportBuilder() {
        this.dreamReport = new DreamReport();
    }

    public DreamReportBuilder withSummary(String summary) {
        dreamReport.setSummary(summary);
        return this;
    }

    public DreamReportBuilder withSymbolicalSection(String symbolicalSection) {
        dreamReport.setSymbolicalSection(symbolicalSection);
        return this;
    }

    public DreamReportBuilder withGraphicalInsights(String graphicalInsights) {
        dreamReport.setGraficalInsights(graphicalInsights);
        return this;
    }

    public DreamReport build() {
        return dreamReport;
    }
}
