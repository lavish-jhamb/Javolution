# Java 13 Features

1. **Text Blocks (Preview)**: 
   - A new way to declare multi-line string literals, improving readability and maintainability of code that includes large blocks of text.
   - Making it easier to handle JSON, HTML, SQL, etc., directly in your code.

2. **Switch Expressions (Preview)**: 
   - Enhancements to the switch statement, allowing it to be used as an expression and returning a value, which simplifies code and reduces boilerplate.
   - It supports both traditional case labels and the new `case` label syntax, which can be used to group multiple cases together.
   - The `yield` statement is introduced to return a value from a switch expression.
   - **Benefit**: What if you need to do more than a single statement, like call a method or run several lines in a case? You can use a block—and now, you must explicitly use yield to return a value from the block.

3. **Dynamic CDS Archives**:
   - Class Data Sharing (CDS) is extended to allow dynamic archiving of classes at runtime, which can improve startup performance and reduce memory footprint.
   - This feature allows applications to create a shared archive of classes that can be used by multiple Java Virtual Machine (JVM) instances.

4. **Reimplement the Legacy Socket API**:
   - The legacy socket API is reimplemented to improve performance and reliability.
   - This includes enhancements to the `java.net.Socket` and `java.net.ServerSocket` classes, making them more efficient and easier to use.
   - This change is part of an ongoing effort to modernize the Java networking API and improve its performance.
   - **Note**: Transparent to developers, but it improves the underlying implementation of sockets.

5. **ZGC: Uncommit unused Memory**:
   - The Z Garbage Collector (ZGC) is enhanced to allow it to uncommit unused memory, which can help reduce the memory footprint of applications.
   - This feature allows ZGC to return memory to the operating system when it is no longer needed, improving overall memory management.

6. **Application Class-Data Sharing**:
   - This feature allows applications to share class metadata across multiple JVM instances, improving startup time and reducing memory usage.
   - It enables the sharing of common classes between different applications, which can lead to significant performance improvements in environments with multiple Java applications running simultaneously.