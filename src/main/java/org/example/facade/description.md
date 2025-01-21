## The Facade Design Pattern provides a simple interface (called a facade) to a complex subsystem.
- Instead of interacting with multiple complicated components, the client interacts with a single facade class that simplifies the usage of the subsystem.
- Think of it as a restaurant waiter: The waiter takes your order (simple interface) and interacts with the kitchen, cashier, and other staff (complex subsystems) on your behalf.

# Home Theater System
- Imagine you have a home theater system with several components:
    TV
    Sound System
    DVD Player
    Streaming Device

- To watch a movie, you must:
    Turn on the TV.
    Turn on the sound system and set the correct input mode.
    Start the DVD player or streaming device.
    Adjust the settings.

- Instead of making the client interact with all these components separately, the Facade class provides a single method like watchMovie() to handle all the steps.

## Why This is a Good Facade Pattern?

# Simplified Interface:
- The client only needs to interact with the HomeTheaterFacade, not the individual components.

# Encapsulation of Complexity:
- The facade hides the complexity of the subsystem, making it easier to use.

# Decoupled Client:
- Changes to the subsystems don’t affect the client, as long as the facade’s interface remains the same.

## Problems with the Bad Example

# Client Complexity:
- The client must understand and use the methods of each subsystem.

# Tight Coupling:
- The client is tightly coupled to the subsystems. If the internal workings of the TV, sound system, or DVD player change, the client code must also be updated.

# Repetition:
- Every time a movie is played, the client has to repeat the same steps, increasing the chance of errors.