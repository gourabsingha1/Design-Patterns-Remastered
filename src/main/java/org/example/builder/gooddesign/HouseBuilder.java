package org.example.builder.gooddesign;

// Step 2: Define the Builder
public class HouseBuilder {
    public int rooms;
    public int bathrooms;
    public String roofType;
    public boolean hasGarage;
    public boolean hasSwimmingPool;

    public HouseBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseBuilder setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
        return this;
    }

    public HouseBuilder setRoofType(String roofType) {
        this.roofType = roofType;
        return this;
    }

    public HouseBuilder setGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    public House build() {
        return new House(this);
    }
}
