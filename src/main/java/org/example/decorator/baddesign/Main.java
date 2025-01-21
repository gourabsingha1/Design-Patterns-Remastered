package org.example.decorator.baddesign;

public class Main {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee(true, false, false); // Coffee with milk only
        System.out.println("Cost of Coffee with Milk: " + coffee1.cost());

        Coffee coffee2 = new Coffee(true, true, false); // Coffee with milk and sugar
        System.out.println("Cost of Coffee with Milk and Sugar: " + coffee2.cost());

        Coffee coffee3 = new Coffee(true, true, true); // Coffee with all add-ons
        System.out.println("Cost of Coffee with Milk, Sugar, and Whipped Cream: " + coffee3.cost());
    }
}
