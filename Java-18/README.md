# Java 18 Features

1. **UTF-8 by Default**: Java 18 uses UTF-8 as the default character encoding for the JVM, improving consistency across platforms.
   - **Note**: This change ensures that text files and streams are read and written using UTF-8 encoding by default, which is more widely used and supported.
   - Consistency across platforms → avoid bugs where string encoding differs between Windows/Linux/Mac.

2. **Pattern Matching for switch (second preview)**: Simplifies the syntax for switch statements and expressions, allowing for more concise and readable code.
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

3. **Simple web server**:
    - Java 18 includes a simple web server that can be used for testing and development purposes.
    - It is lightweight and easy to use, making it suitable for quick prototyping and testing of web applications.
    - **Why**: Previously, developers relied on external servers like Apache, Nginx, or Python’s http.server.
```bash
# Run in terminal (no code needed)
jwebserver --port 8000 --directory .
```
4. **Code Snippets in Java API Documentation**:
    - Java 18 introduces a new feature that allows developers to include code snippets in the Java API documentation.
    - This makes it easier to understand how to use the APIs and provides examples of common use cases.
    - **Why**: Enhances the readability and usability of the documentation, making it more developer-friendly.

5. **Vector API (third incubator)**:
    - The Vector API is an incubating feature that provides a mechanism for expressing vector computations, allowing developers to write code that can take advantage of hardware acceleration.
    - It enables the use of SIMD (Single Instruction, Multiple Data) operations, improving performance for numerical and data-parallel computations.
    - **Why**: This feature is particularly useful for applications that require high-performance computing, such as scientific simulations and data processing.

6. **Internet-Address Resolution API**:
    - Java 18 introduces an API for resolving internet addresses, making it easier to work with network addresses and protocols.
    - This API provides a more consistent and reliable way to handle internet addresses, improving the overall networking capabilities of Java applications.
    - **Why**: Allows custom DNS resolvers instead of default OS DNS.

7. **Foreign Function & Memory API (second incubator)**:
    - The Foreign Function & Memory API is an incubating feature that provides a way to interact with native code and memory in a more controlled and safer manner.
    - Enables calling native code (C/C++) and managing off-heap memory safely without JNI.
    - **Why**:
      - This API is particularly useful for applications that need to interface with native libraries or perform low-level memory operations.
      - JNI is complex and unsafe. This API provides memory-safe interop.

8. **Deprecations and Removals**:
    - Some features and APIs have been deprecated or removed in Java 18, Finalization deprecated.
    - finalize() is discouraged → replaced by try-with-resources or Cleaner API.
    - **Why**: These features are no longer widely used and have security limitations, making them candidates for removal in future releases.