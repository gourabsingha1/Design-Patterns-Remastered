package org.example.decorator.baddesign;

public class Coffee {
    private boolean milk;
    private boolean sugar;
    private boolean whippedCream;

    public Coffee(boolean milk, boolean sugar, boolean whippedCream) {
        this.milk = milk;
        this.sugar = sugar;
        this.whippedCream = whippedCream;
    }

    public double cost() {
        double cost = 5.0;  // Base cost for simple coffee
        if (milk) {
            cost += 1.5;
        }
        if (sugar) {
            cost += 0.5;
        }
        if (whippedCream) {
            cost += 2.0;
        }
        return cost;
    }
}
