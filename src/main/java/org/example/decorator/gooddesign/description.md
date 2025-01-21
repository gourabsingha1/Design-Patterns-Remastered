## The Decorator Design Pattern allows you to extend the functionality of an object without modifying the object's code.
- This pattern is useful when you want to add features or behaviors to an object in a flexible way.

## Explanation

# Coffee Interface:
- The Coffee interface defines a method cost(), which returns the cost of a coffee.

# SimpleCoffee (Concrete Component):
- This is the basic coffee class that implements the Coffee interface and has a fixed cost.

# CoffeeDecorator (Abstract Decorator):
- This class implements Coffee and contains a reference to a Coffee object. It delegates the cost() method to the wrapped Coffee object, so you can build on it.

# Concrete Decorators (MilkDecorator, SugarDecorator, WhippedCreamDecorator):
- These classes extend CoffeeDecorator and add new behavior (like adding the cost of milk, sugar, or whipped cream) to the coffee.

## Why is This a Good Decorator?

# Flexible:
- You can mix and match decorators in different combinations.

# Open for Extension:
- You can add new decorators without modifying the existing code (for example, adding a CaramelDecorator in the future).

# Doesn't Modify Original Object:
- You don’t modify SimpleCoffee; instead, you dynamically wrap it with additional features.