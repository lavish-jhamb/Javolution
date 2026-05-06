# Java 25 Features

1. **Instance Main Method (Final):**
   - Java 25 introduces the ability to define a main method as an instance method, allowing for more flexible application entry points.
   - This feature enables developers to create applications that can be started with an instance of a class, rather than requiring a static main method.
   - Usage: You can define a main method as an instance method in your class, and the Java runtime will recognize it as the entry point for the application.
   - Benefit: Provides more flexibility in how applications are structured and allows for more object-oriented designs when defining the main method.

2. **Compact Source Files (Final):**
   - Java 25 introduces compact source files, which allow developers to write more concise code by reducing boilerplate and improving readability.
   - This feature includes enhancements to the syntax and structure of Java source files, making it easier to write and maintain code.
   - Usage: Developers can take advantage of compact source files by using new language features that reduce the need for verbose code, such as improved type inference and simplified class definitions.
   - Benefit: Enhances developer productivity and code clarity by allowing for more concise and readable source files.

3. **Console IO (Final):**
   - Java 25 introduces a new Console IO API that provides a more modern and efficient way to handle console input and output.
   - This feature includes improvements to the way developers can read from and write to the console, making it easier to create interactive command-line applications.

4. **Module Import Declarations (Final):**
   - Java 25 introduces module import declarations, which allow developers to remove bulky imports from a class and instead specify whole modules to be imported.
   - Example:
   - ```java
   import module java.base.*; // Imports all classes from the java.base module
   import module java.sql.*;  // Imports all classes from the java.sql module
   ```
   
5. **Flexible Constructors Bodies (Final):**
   - Java 25 allows for more flexible constructor bodies, allowing any kind of statement before super() call.
    - This feature provides developers with more freedom in how they structure their constructors, enabling them to perform operations (additional checks) or initialize fields before calling the superclass constructor.

6. **Key Derivation Function API** (Final):**
   - Java 25 introduces a new Key Derivation Function (KDF) API that provides a standardized way to derive cryptographic keys from passwords or other input data.
   - This feature includes support for various KDF algorithms, such as PBKDF2, scrypt, and Argon2, allowing developers to choose the most appropriate algorithm for their security needs.
   - Usage: Developers can use the KDF API to securely derive keys for encryption, authentication, or other cryptographic operations, enhancing the security of their applications.
   - Benefit: Provides a standardized and secure way to derive cryptographic keys, improving the security of applications that rely on password-based key derivation.
   - Note: No need to use third-party libraries for key derivation, as the KDF API is now part of the Java standard library.

7. **Scoped Values API (Final):**
   - A ScopedValue is a new feature in Java that allows you to share immutable data (data that doesn’t change) across methods within a thread and, optionally, its child threads, without having to pass the data explicitly everywhere.
   - It is designed to be simpler and more efficient than ThreadLocal, avoiding common pitfalls like memory leaks.
   - Scoped values have a limited lifetime: once the scope ends, the binding automatically disappears, ensuring safe and predictable usage.
   - Scoped Values in Java 25 are like ThreadLocal on steroids:
     - They provide a temporary, scoped value for a block of code.
     - Child threads automatically see the value.
     - Once the scope ends, the value disappears automatically.
   - Think of it like: “I temporarily put a sticky note on this thread and all its children, and it vanishes when I’m done.” 📝