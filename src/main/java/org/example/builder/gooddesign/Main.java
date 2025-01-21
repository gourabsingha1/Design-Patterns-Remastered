package org.example.builder.gooddesign;

// Step 3: Client Code
public class Main {
    public static void main(String[] args) {
        // Building a house with 3 rooms, 2 bathrooms, a tiled roof, a garage, and no swimming pool
        House house1 = new HouseBuilder()
                .setRooms(3)
                .setBathrooms(2)
                .setRoofType("Tiled")
                .setGarage(true)
                .setSwimmingPool(false)
                .build();

        // Building another house with different specifications
        House house2 = new HouseBuilder()
                .setRooms(5)
                .setBathrooms(4)
                .setRoofType("Thatched")
                .setGarage(true)
                .setSwimmingPool(true)
                .build();

        System.out.println(house1);
        System.out.println(house2);
    }
}
