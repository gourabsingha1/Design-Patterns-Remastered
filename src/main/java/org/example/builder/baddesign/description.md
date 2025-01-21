## The Builder Design Pattern is used to construct complex objects step-by-step.
- Instead of creating the object directly, you use a builder class to configure the object piece by piece.
- This is useful when an object has many optional attributes or requires multiple steps to construct.

# Hard to Read: 
- The constructor parameters are not self-explanatory, making the code harder to understand.

# Rigid Design:
- Adding or removing attributes requires changing the constructor, which can break existing code.

# Error-Prone:
- The client might accidentally pass parameters in the wrong order (e.g., swapping the boolean values for hasGarage and hasSwimmingPool).