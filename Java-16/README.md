# Java 16 Features

1. **Pattern Matching for `instanceof` (Standard)**: Simplifies the common practice of checking an object's type and casting it in a single operation.
   ```java
   if (obj instanceof String s) {
       System.out.println(s.toUpperCase());
   }
   ```
   
2. **Records (Standard)**: A new class type that is a quick way to create data-carrying classes without boilerplate code.
   ```java
   record Point(int x, int y) {}
   Point p = new Point(1, 2);
   System.out.println(p.x() + ", " + p.y());
   ```
   
3. **Sealed Classes (second preview)**: Allows developers to control which classes can extend or implement a class or interface.
   ```java
    sealed class Shape permits Circle, Square {}
    final class Circle extends Shape {}
    final class Square extends Shape {}
    Shape shape = new Circle();
    ```
   
4. **Vector API (Incubator)**: Introduces a new API for vector computations, which can be used to perform operations on vectors in a more efficient way.
   ```java
   import java.util.Vector;
   Vector<Integer> vector = new Vector<>();
   vector.add(1);
   vector.add(2);
   System.out.println(vector);
   ```
   - **Benifits**
     - Improves performance for vector operations.
     - Provides a more efficient way to handle vector computations.