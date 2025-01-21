package org.example.builder.baddesign;

public class Main {
    public static void main(String[] args) {
        // The client needs to remember the order of parameters
        House house = new House(3, 2, "Tiled", true, false);
        System.out.println(house);
    }
}

