package org.example.singleton.baddesign;

public class Main {
    public static void main(String[] args) {
        // First access
        SettingsManager settings1 = SettingsManager.instance;
        settings1.setTheme("Dark");
        settings1.setLanguage("English");

        // Second access - creates a new instance because the constructor is public
        SettingsManager settings2 = new SettingsManager();
        settings2.setTheme("Light");
        settings2.setLanguage("Spanish");

        // The instances are different!
        System.out.println(settings1 == settings2); // Outputs: false
    }
}
