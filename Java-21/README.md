# Java 21 Features

1. **Virtual Threads: (Finalized)**
 - Virtual threads are lightweight compared to OS threads → millions can run concurrently.
 - They are managed by the Java Virtual Machine (JVM) rather than the operating system.
 - They simplify concurrent programming by allowing developers to write code in a synchronous style while still benefiting from the performance of asynchronous execution.
 - Millions of tasks can run → better scalability for servers and microservices.

2. **Record Patterns: (Finalized)**
 - Record patterns allow for more concise and readable code when working with records.
 - They enable pattern matching for record types, making it easier to destructure and access data within records.
 - This feature enhances the expressiveness of the language and reduces boilerplate code.

3. **Pattern Matching for Switch: (Finalized)**
 - Pattern matching for switch statements allows developers to use patterns to match against the type and structure of objects.
 - This feature simplifies the code by eliminating the need for multiple instanceof checks and casting.
 - It enhances the readability and maintainability of switch statements.
 - switch now supports type patterns and guards (when).
 - No more instanceof + casting boilerplate.

4. **Sequenced Collections: (Finalized)**
 - Sequenced collections are a new type of collection that maintains the order of elements.
 - New interfaces to maintain predictable order of elements.
 - They provide a consistent way to work with ordered collections, such as lists and sets and maps.
 - This feature enhances the expressiveness of the Java Collections Framework and simplifies working with ordered data.
 - Useful for ordered data processing.

5. **Scoped Values: (Preview)**
 - Scoped values are a new way to manage data that is scoped to a specific context, such as a thread or a request.
 - They provide a way to share data between different parts of an application without using global state.
 - This feature enhances the modularity and maintainability of Java applications by reducing the reliance on global variables.
- aiming to provide a safe and efficient way to share data within and across threads.
- This feature is particularly useful for context-specific data that needs to be accessible throughout the execution of certain code blocks,
but without the risks and complexities associated with thread-local variables.

6. **String Templates: (Preview)**
 - String templates provide a new way to create strings with embedded expressions.
 - They allow developers to write more readable and maintainable code by reducing the need for concatenation and formatting.
 - This feature enhances the expressiveness of the language and simplifies string manipulation.
 - It allows for easier construction of complex strings with embedded variables and expressions.

7. **Foreign Function and Memory API: (Third Preview)**
 - The Foreign Function and Memory API provides a way to interact with native code and memory in a safe and efficient manner.
 - It allows developers to call native functions and access native memory without using JNI (Java Native Interface).
 - This feature enhances the performance and interoperability of Java applications with native libraries and systems.

8. **Key Encapsulation Mechanism (KEM) for Encryption:**
 - New cryptography API.
 - KEM provides a way to securely encapsulate keys for encryption.
 - It enhances the security of cryptographic operations by providing a standardized way to handle key encapsulation.
 - This feature simplifies the implementation of secure encryption mechanisms in Java applications.

9. **Unnamed classes: (Preview)**
 - Unnamed classes are a new way to define classes without giving them a name.
 - They allow for more concise and readable code by reducing boilerplate code.
 - This feature enhances the expressiveness of the language and simplifies class definitions.
 - No need for public class Hello { public static void main(String[] args) { … } }.

10. **Unnamed Patterns and Variables:**
 - Unnamed patterns and variables allow developers to use patterns without explicitly naming them.
 - This feature simplifies the code by reducing the need for unnecessary variable names.
 - It enhances the expressiveness of the language and reduces boilerplate code.
 - Useful for cases where the name of a variable is not needed.
 - Use _ for unused variables/patterns → less noise.
 - Cleaner code when variables aren’t needed.

11. **Deprecations / Removals:**
 - RMI Activation System (removed).
 - Finalization → deprecated for removal (use Cleaner).