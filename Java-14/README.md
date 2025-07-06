# Java 14 Features

1. **Switch Expressions ( Standard Feature ):**
    - Switch expressions became a standard feature in Java 14 (was preview in Java 12 & 13).
    - **Benefits:**
        - Shorter, safer syntax.
        - Can return values (expression form).
        - No fall-through by default.

2. ** Helpful NullPointerExceptions ( Standard Feature ):**
    - Provides more informative messages when a `NullPointerException` occurs.
    - **Benefits:**
        - Easier debugging with clearer exception messages.
        - Helps identify the exact variable that was null.

3. **Records ( Preview Feature ):**
    - Record is a new type of class in Java used for data carriers — less boilerplate for POJOs.
    - **Benefits:**
        - Auto-generates constructor, getters, toString(), equals(), hashCode().
        - Field are private & final by default. ( private final data_type field_name = value; )
        - Immutable by default.
        - By default, records are `final` and cannot be extended.
        - Concise syntax for declaring data classes.
        - Great for DTOs and APIs.
    - **Note:**
         - **can have or can:**
            - Instance methods
            - Static methods
            - Static fields
            - Implement interfaces
            - override default constructor
         - **can't have or can't:**
           - Instance fields
           - Extend other classes

4. **Pattern Matching for instanceof ( Preview Feature ):**
   - Eliminates the need to cast an object after instanceof checks.
   - **Benefits:**
       - Cleaner and more concise code.
       - Reduces boilerplate casting code.

5. **Text Blocks ( Second Preview ):**
    - Multi-line string literals. Improved from their first preview in Java 13.
    - **Benefits:**
         - Easier to read and maintain multi-line strings.
         - Avoids the need for escape sequences.
         - Useful for JSON, SQL, HTML, etc.

6. **Packaging Tool ( Incubator ) ( Standard Feature ):**
    - Tool (jpackage) to package Java applications into native installers.
    - **Benefits:**
        - Creates platform-specific packages (e.g., .exe, .dmg).
        - Simplifies distribution of Java applications.
        - Supports custom icons and metadata.