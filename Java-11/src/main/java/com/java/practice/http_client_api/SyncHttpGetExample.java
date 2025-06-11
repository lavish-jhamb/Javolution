package com.java.practice.http_client_api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SyncHttpGetExample {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Create an HttpClient
        HttpClient client = HttpClient.newHttpClient();

        // Create an HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()                                                              // Optional, as GET is default
                .build();

        // Send the request and get the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Continue with other tasks
        System.out.println("Request sent synchronously!"); // will wait for above response to be finished.

        // Print the response
        System.out.println("HTTP Status Code: " + response.statusCode());
        System.out.println("Response Body: ");
        System.out.println(response.body());

    }
}
