package co.edu.uptc.objectpool;

import java.util.LinkedList;
import java.util.Queue;

import co.edu.uptc.analysis.Analysis;
import co.edu.uptc.analysis.CognitiveAnalysis;
import co.edu.uptc.analysis.EmotionalAnalysis;
import co.edu.uptc.analysis.StaticalAnalysis;
import co.edu.uptc.analysis.SymbolicalAnalysis;

public class AnalyzerPool {
    private static final int MAX_ANALYZERS = 5;
    private static final Queue<Analysis> pool = new LinkedList<>();

    static {
        pool.add(new SymbolicalAnalysis());
        pool.add(new EmotionalAnalysis());
        pool.add(new StaticalAnalysis());
        pool.add(new CognitiveAnalysis());
        pool.add(new SymbolicalAnalysis());
    }

    public static Analysis borrow() {
        if (pool.isEmpty()) {
            System.out.println("No hay analizadores disponibles.");
            return null;
        }
        return pool.poll();
    }

    public static void release(Analysis analyzer) {
        if (analyzer != null && pool.size() < MAX_ANALYZERS) {
            pool.offer(analyzer);
        }
    }
}