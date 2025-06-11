package com.java.practice.http_client_api;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncHttpGetExample {

    public static void main(String[] args) {

        // Create an instance of HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Create an HttpRequest for an HTTP GET request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))  // Example API endpoint
                .GET()                                                            // Optional since GET is the default method
                .build();

        // Send an asynchronous request
        CompletableFuture<HttpResponse<String>> responseFuture = client.sendAsync(request, HttpResponse.BodyHandlers.ofString()); // Response body handler for plain text

        // Handle the response when it’s available
        responseFuture.thenApply(HttpResponse::body)                                 // Process the body of response
                .thenAccept(body -> System.out.println("Response: " + body))  // Print the Response
                .exceptionally(ex -> {
                    System.err.println("Request Failed: " + ex.getMessage());
                    return null;
                });

        // Continue with other tasks
        System.out.println("Request sent asynchronously!");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

}
