package co.edu.uptc.factorymethod;

public abstract class DreamRepositoryFactory {
    public static DreamRepository createRepository(String type) {
        return switch (type.toLowerCase()) {
            case "historial", "historical" -> new DreamHistory();
            case "temporal", "temporary" -> new DreamTemporal();
            default -> throw new IllegalArgumentException("Tipo de repositorio no válido: " + type);
        };
    }
}
