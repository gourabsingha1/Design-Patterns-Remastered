package org.example.singleton.gooddesign;

public class Main {
    public static void main(String[] args) {
        // Get the single instance of SettingsManager
        SettingsManager settings1 = SettingsManager.getInstance();
        settings1.setTheme("Dark");
        settings1.setLanguage("English");

        // Get the same instance again
        SettingsManager settings2 = SettingsManager.getInstance();
        settings2.setTheme("Light");
        settings2.setLanguage("Spanish");

        // Check if both instances are the same
        System.out.println(settings1 == settings2); // Outputs: true
    }
}

