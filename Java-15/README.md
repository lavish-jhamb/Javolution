# Java 15 Features

1. **Text Blocks (Standard Feature)**: Text blocks, first previewed in Java 13/14, are now a permanent language feature.
    ```java
    String sql = """
        SELECT id, name
        FROM users
        WHERE age > 30
        ORDER BY name
         """;
    ```

2. **Records (Second Preview)**: Records provide a concise syntax for data carrier classes.
    ```java
    record User(int id, String name) {}
    ```

3. **Pattern Matching for instanceof (Second Preview)**: Improves readability when checking types using instanceof.
    ```java
    if (obj instanceof String s) {
        System.out.println(s.toUpperCase());
    }
    ```
4. **Shenandoah: Low-Pause-Time Garbage Collector (Production)**: Shenandoah GC (previously experimental) is now
   available as a production-ready GC.

5. **Sealed Classes (Preview)**: Sealed classes restrict which classes can extend or implement them.
    ```java
    sealed class Shape permits Circle, Square {}
    final class Circle extends Shape {}
    final class Square extends Shape {}
    ```
    - **Benefits**:
        - Provides more control over class hierarchies.
        - enhancing security and maintainability.
    - **Note**: We can use sealed keyword in interfaces as well.

6. **Hidden Classes (Preview)**: Introduces support for classes not discoverable via reflection, mainly for frameworks and dynamic proxies.
    - **Use Case**:
        - Used internally by frameworks like ByteBuddy, Mockito, etc.
    - **Benefits**:
        - Improves JVM performance.
        - Reduces memory footprint of dynamic class generation.