package org.example.decorator.gooddesign;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;  // Adding cost for sugar
    }
}
