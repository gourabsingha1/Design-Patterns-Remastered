## The Builder Design Pattern is used to construct complex objects step-by-step.
- Instead of creating the object directly, you use a builder class to configure the object piece by piece.
- This is useful when an object has many optional attributes or requires multiple steps to construct.

# Readability:
- The client code is easy to read, as the method names clearly indicate what they do.

# Flexibility:
- You can create variations of the House object without needing multiple constructors.

# Immutability:
- Once a House object is created, its state cannot be changed.

# Separation of Concerns:
- The construction logic is in the builder, not the House class.