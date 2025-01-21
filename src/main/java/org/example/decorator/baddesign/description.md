## The Decorator Design Pattern allows you to extend the functionality of an object without modifying the object's code.
- This pattern is useful when you want to add features or behaviors to an object in a flexible way.

# Rigid:
- You have to modify the BadCoffee class every time you add a new feature (e.g., adding a caramel option).

# Not Flexible:
- If you wanted to create a coffee with different combinations of features, you would need to create many constructors or setter methods, making the class messy.

# No Separation of Concerns:
- The class mixes the basic coffee and the additional features, which goes against the idea of decorators being separate objects that modify behavior dynamically.