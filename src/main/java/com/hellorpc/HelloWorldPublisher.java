package com.hellorpc;

import jakarta.xml.ws.Endpoint;

public class HelloWorldPublisher {

    public static void main(String[] args) throws InterruptedException {
        Endpoint.publish("http://localhost:8888/hello", new HelloWorldImpl());
        System.out.println("Server running at http://localhost:8888/hello");
        System.out.println("WSDL at       http://localhost:8888/hello?wsdl");
        Thread.currentThread().join(); // keep alive
    }
}