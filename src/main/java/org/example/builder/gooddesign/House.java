package org.example.builder.gooddesign;

// Step 1: Define the Product (House)
public class House {
    private int rooms;
    private int bathrooms;
    private String roofType;
    private boolean hasGarage;
    private boolean hasSwimmingPool;

    // Private constructor to enforce the use of the Builder
    House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.roofType = builder.roofType;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", bathrooms=" + bathrooms +
                ", roofType='" + roofType + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}

