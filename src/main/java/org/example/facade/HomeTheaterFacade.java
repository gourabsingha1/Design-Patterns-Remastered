package org.example.facade;

// Step 2: Facade Class
public class HomeTheaterFacade {
    private TV tv;
    private SoundSystem soundSystem;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(TV tv, SoundSystem soundSystem, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        tv.turnOn();
        tv.setHDMIInput();
        soundSystem.turnOn();
        soundSystem.setSurroundSound();
        dvdPlayer.turnOn();
        dvdPlayer.playMovie(movie);
        System.out.println("Movie is ready to play. Enjoy!");
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        System.out.println("All components are turned OFF.");
    }
}
