## The Observer Design Pattern is used when you want one object (called the subject) to notify other objects (called observers) about changes in its state.
- When the subject’s state changes, all the observers are automatically updated.
- This pattern is typically used in scenarios where multiple objects need to stay in sync with the state of a single object.
- Think of it like a newsletter subscription: When a new newsletter is released (state change), all subscribers (observers) get notified.

## Bad Design (Violating Observer Design Pattern)
- In this design, the Stock class has to explicitly notify each observer.
- If we need to add or remove observers or change the way notifications are sent,
  we will need to modify the Stock class, violating the open/closed principle.