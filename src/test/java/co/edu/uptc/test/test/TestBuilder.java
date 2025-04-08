package co.edu.uptc.test;

import co.edu.uptc.controller.DreamAnalyzerController;
import co.edu.uptc.model.Dream;
import co.edu.uptc.model.DreamReport;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DreamAnalyzerControllerTest {

    @Test
    public void testDreamAnalysisAndReportBuilder() {
        Dream dream = new Dream("D001", "Soñé que volaba sobre montañas", 6.5, 8.0, 9.2);
        DreamAnalyzerController controller = new DreamAnalyzerController();

        DreamReport report = controller.analyzeDream(dream);

        assertNotNull(report);
        assertNotNull(report.getSummary());
        assertTrue(report.getSymbolicalSection().contains("Soñé que volaba"));
        assertTrue(report.getGraficalInsights().length() > 0);
    }
}
