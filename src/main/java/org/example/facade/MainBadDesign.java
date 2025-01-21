package org.example.facade;

public class MainBadDesign {
    public static void main(String[] args) {
        // Create subsystem components
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();

        // The client has to call each subsystem manually
        System.out.println("Get ready to watch a movie...");
        tv.turnOn();
        tv.setHDMIInput();
        soundSystem.turnOn();
        soundSystem.setSurroundSound();
        dvdPlayer.turnOn();
        dvdPlayer.playMovie("Inception");
        System.out.println("Movie is ready to play. Enjoy!");
    }
}
