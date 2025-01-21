## Factory Design Pattern
- You ask the factory for an object (e.g., a Circle or a Rectangle).
- The factory creates the object for you.
- You don’t need to know how the object is created, which makes your code simpler and cleaner.

# No Interface:
- The factory returns Object, forcing the client to cast it to the desired type.

# Open-Closed Principle Violation:
- Adding a new shape requires modifying the factory, risking breaking existing functionality.

# Error-Prone:
- The client might misuse the factory due to lack of type safety.