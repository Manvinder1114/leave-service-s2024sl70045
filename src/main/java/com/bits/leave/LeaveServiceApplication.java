package com.bits.leave;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class LeaveServiceApplication {

    public static void main(String[] args) throws Exception {

        int port = 8080;
        String environment = System.getenv().getOrDefault("APP_ENV", "local");

        HttpServer server = HttpServer.create(
            new InetSocketAddress("0.0.0.0", port), 0
        );

        server.createContext("/", exchange -> {
            String response =
                "Employee Leave Service is running!\n" +
                "BITS ID: s2024sl70045\n" +
                "Environment: " + environment + "\n" +
                "Service: Leave Management";

            byte[] bytes = response.getBytes(StandardCharsets.UTF_8);

            exchange.getResponseHeaders().set(
                "Content-Type", "text/plain; charset=UTF-8"
            );

            exchange.sendResponseHeaders(200, bytes.length);

            try (OutputStream os = exchange.getResponseBody()) {
                os.write(bytes);
            }
        });

        server.start();

        System.out.println("Employee Leave Service started on port " + port);
        System.out.println("Environment: " + environment);
    }
}
