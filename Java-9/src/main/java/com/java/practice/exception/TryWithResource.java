package com.java.practice.exception;

/**
 * DESCRIPTION: In Java 9, you can now use already declared final or effectively final resources in try-with-resources.
 * This means you can declare the resource outside the try, then use it inside, as long as it’s final or effectively final.\
 * <p>
 * 📝 Auto-Close Order:
 * -   In try (res1; res2; res3):
 * -   The resources are closed in reverse order: res3.close(), then res2.close(), then res1.close().
 * -   This ensures that if later resources depend on earlier ones, they are closed safely and predictably.
 * <p>
 * ⚠️ Reminder: Must Be AutoCloseable
 * -   Each resource must implement the AutoCloseable interface. Most Java I/O classes like BufferedReader, BufferedWriter, FileInputStream, etc., do.
 */
class Resource implements AutoCloseable {
    private final String name;

    public Resource(String name) {
        this.name = name;
        System.out.println(name + " opened");
    }

    @Override
    public void close() {
        System.out.println(name + " closed");
    }
}

public class TryWithResource {

    public static void main(String[] args) {
        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");

        try (r1; r2) {
            System.out.println("using resources");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
