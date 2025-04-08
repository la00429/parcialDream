package co.edu.uptc.singleton;

import java.util.regex.Pattern;

public class SystemSettings {
    // la instancia única del Singleton
    private static final SystemSettings instance = new SystemSettings();

    // el parámetros de configuración (ejemplo: ética)
    private boolean allowExplicitContent = false;

    // este es el constructor privado
    private SystemSettings() {
        System.out.println("-->Configuración del sistema inicializada.<--");
    }

    // aqui esta el método para obtener la instancia
    public static SystemSettings getInstance() {
        return instance;
    }

    // aqui se configurar el parámetros del sistema
    public void configureSystem(boolean allowExplicitContent) {
        this.allowExplicitContent = allowExplicitContent;
        System.out.println("--<Contenido explícito permitido: " + allowExplicitContent + ">--");
    }

    // se hace la validación ética (por ejemplo: violencia)
    public boolean validateEthics(String dreamContent) {
        if (!allowExplicitContent && dreamContent.toLowerCase().contains("violencia")) {
            System.out.println("--<Contenido éticamente restringido detectado." + ">--");
            return false;
        }
        return true;
    }

    // se hace la validación de lenguaje (no símbolos extraños)
    public boolean validateLanguage(String dreamContent) {
        if (!Pattern.matches("^[a-zA-Z0-9\\s,.!?áéíóúÁÉÍÓÚñÑ]+$", dreamContent)) {
            System.out.println("--<Contenido con símbolos o caracteres no permitidos." + ">--");
            return false;
        }
        return true;
    }
}
