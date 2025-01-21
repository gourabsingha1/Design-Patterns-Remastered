## The Singleton Design Pattern ensures that a class has only one instance and provides a global way to access it.
- Think of it like a single power switch in your house—there’s only one, and everyone uses the same one.

## Explanation

# Private Static Instance:
- The instance variable is declared private static, so there is only one copy shared across the program.

# Private Constructor:
- The constructor is private to prevent creating instances using new SettingsManager(). This ensures only one instance is created.

# Public Static Method:
- The getInstance() method ensures that only one instance is returned. If it doesn't exist yet, it is created.

## Why This is Good

# Single Instance:
- SettingsManager will have only one instance throughout the entire application.

# Easy to Access:
- Any part of your application can access the SettingsManager using SettingsManager.getInstance().

# Global Access:
- The settings are consistent because only one instance is used across the app.