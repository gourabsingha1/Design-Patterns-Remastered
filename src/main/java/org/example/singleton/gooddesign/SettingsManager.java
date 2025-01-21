package org.example.singleton.gooddesign;

public class SettingsManager {
    // Step 1: Create a private static instance
    // volatile is used to mark a variable as being stored in the main memory. Thread B cannot access even when Thread A hasn't finished
    private static volatile SettingsManager instance;

    // Step 2: Make the constructor private to prevent instantiation
    private SettingsManager() {
        // Initialize settings (e.g., default theme or language)
        System.out.println("SettingsManager initialized");
    }

    // Step 3: Provide a public static method to get the single instance
    public static SettingsManager getInstance() {
        // Since its volatile, we cannot cache. Hence it retrieves from main memory which is not optimal
        SettingsManager result = instance;
        if (result == null) {
            // To prevent multiple threads accessing at the same time
            synchronized (SettingsManager.class) {
                result = instance;
                if (result == null) {
                    // If the instance doesn't exist, create it
                    instance = result = new SettingsManager();
                }
            }
        }
        return instance;
    }

    // Settings related methods
    public void setTheme(String theme) {
        System.out.println("Setting theme to: " + theme);
    }

    public void setLanguage(String language) {
        System.out.println("Setting language to: " + language);
    }
}
