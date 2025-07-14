# Java 17 Features

1. **Sealed Classes**: Allow you to control which classes can extend or implement them, providing a way to restrict the inheritance hierarchy.
   ```java
   public sealed class Shape permits Circle, Square {
       // ...
   }

   public final class Circle extends Shape {
       // ...
   }

   public final class Square extends Shape {
       // ...
   }
   ```
   - **Note**
    - Implementing sealed classes requires the `permits` clause to specify which classes are allowed to extend the sealed class.
    - Sealed classes can be `sealed`, `non-sealed`, or `final`.
    - Implementing classes must be declared as `final`, `sealed`, or `non-sealed`.

2. **Pattern Matching for switch (preview)**: Simplifies the syntax for switch statements and expressions, allowing for more concise and readable code.
   ```java
    Object obj = "Hello";
   switch (obj) {
       case String s -> System.out.println("String: " + s);
       case Integer i -> System.out.println("Integer: " + i);
       default -> System.out.println("Unknown type");
   }
   ```
   - **Note**
    - Pattern matching allows you to match against the type of the object and extract its value in a single step.

3. **Enhanced Pseudo-Random Number Generators**: Introduces new interfaces and implementations for random number generation, providing more flexibility and better performance.
   ```java
   import java.util.random.RandomGenerator;
   import java.util.random.RandomGeneratorFactory;

   RandomGenerator generator = RandomGeneratorFactory.of("L64X128MixRandom").create();
   int randomInt = generator.nextInt(100);
   ```
   - **Note**
    - The new random number generators provide better performance and more options for generating random numbers.

4. **New macOS Rendering Pipeline**: Introduces a new rendering pipeline for macOS, improving the performance and quality of Java applications on macOS.

5. **Foreign Function & Memory API (Incubator)**: Provides a way to interact with native code and memory in a more controlled and safer manner.
   ```java
   import jdk.incubator.foreign.*;

   MemorySegment segment = MemorySegment.allocateNative(100);
   segment.set(ValueLayout.JAVA_INT, 0, 42);
   int value = segment.get(ValueLayout.JAVA_INT, 0);
   ```
   - **Note**
    - This API allows you to allocate and manipulate native memory safely, reducing the risk of memory leaks and crashes.

6. **Deprecations and Removals**: Some features and APIs have been deprecated or removed in Java 17, including the Applet API, RMI Activation, and the Security Manager.

7. **JEP 411: Deprecate the Security Manager for Removal**: The Security Manager and its associated API have been deprecated for removal in a future release, as it is no longer widely used and has security limitations.