package org.example.facade;

public class DVDPlayer {
    public void turnOn() {
        System.out.println("DVD player is turned ON.");
    }

    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}
