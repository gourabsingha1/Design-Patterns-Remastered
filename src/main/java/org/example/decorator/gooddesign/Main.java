package org.example.decorator.gooddesign;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost of Simple Coffee: " + coffee.cost());

        // Adding Milk to the Coffee
        coffee = new MilkDecorator(coffee);
        System.out.println("Cost of Coffee with Milk: " + coffee.cost());

        // Adding Sugar to the Coffee
        coffee = new SugarDecorator(coffee);
        System.out.println("Cost of Coffee with Milk and Sugar: " + coffee.cost());

        // Adding Whipped Cream to the Coffee
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println("Cost of Coffee with Milk, Sugar, and Whipped Cream: " + coffee.cost());
    }
}
