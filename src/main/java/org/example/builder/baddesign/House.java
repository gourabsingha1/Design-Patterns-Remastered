package org.example.builder.baddesign;

public class House {
    private int rooms;
    private int bathrooms;
    private String roofType;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    public House(int rooms, int bathrooms, String roofType, boolean hasGarage, boolean hasSwimmingPool) {
        this.rooms = rooms;
        this.bathrooms = bathrooms;
        this.roofType = roofType;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "BadHouse{" +
                "rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                ", roofType='" + roofType + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}