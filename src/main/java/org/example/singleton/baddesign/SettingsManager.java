package org.example.singleton.baddesign;

public class SettingsManager {
    public static SettingsManager instance = new SettingsManager(); // Public instance

    // Public constructor allows direct instantiation
    public SettingsManager() {
        System.out.println("SettingsManager initialized");
    }

    public void setTheme(String theme) {
        System.out.println("Setting theme to: " + theme);
    }

    public void setLanguage(String language) {
        System.out.println("Setting language to: " + language);
    }
}
