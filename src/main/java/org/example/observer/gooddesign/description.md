## The Observer Design Pattern is used when you want one object (called the subject) to notify other objects (called observers) about changes in its state.
- When the subject’s state changes, all the observers are automatically updated.
- This pattern is typically used in scenarios where multiple objects need to stay in sync with the state of a single object.
- Think of it like a newsletter subscription: When a new newsletter is released (state change), all subscribers (observers) get notified.

## Good Design (Using Observer Design Pattern)
- The Stock class (subject) maintains a list of observers
  and notifies them whenever its state changes.
- Observers can dynamically subscribe or unsubscribe from the notifications.
