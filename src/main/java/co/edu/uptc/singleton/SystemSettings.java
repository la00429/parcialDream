package co.edu.uptc.singleton;

public class SystemSettings {
    private SystemSettings systemSettings;

    private SystemSettings(){
        createInstance();
    }

    private void createInstance(){
        systemSettings = new SystemSettings();
    }

    public SystemSettings getInstance(){
        return systemSettings;
    }
}
