package com.hellorpc;

import jakarta.xml.ws.Endpoint;

public class HelloWorldPublisher {

    public static void main(String[] args) throws InterruptedException {
        String url = "http://localhost:8888/hello";
        HelloWorldImpl service = new HelloWorldImpl();
        Endpoint.publish(url, service);
        System.out.println("Server running at "+url);
        System.out.println("WSDL at "+url+"?wsdl");
        Thread.currentThread().join(); // keep alive
    }
}