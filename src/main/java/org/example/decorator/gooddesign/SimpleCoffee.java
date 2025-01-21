package org.example.decorator.gooddesign;

// Step 2: Create a basic Coffee class (Concrete Component)
public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0;  // Simple coffee costs 5 units
    }
}
