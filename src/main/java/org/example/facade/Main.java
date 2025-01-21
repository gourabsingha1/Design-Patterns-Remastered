package org.example.facade;

// Step 3: Client
public class Main {
    public static void main(String[] args) {
        // Create subsystem components
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, soundSystem, dvdPlayer);

        // Simplified interaction with the system
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
