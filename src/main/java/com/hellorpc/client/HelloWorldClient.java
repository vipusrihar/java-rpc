package com.hellorpc.client;

public class HelloWorldClient {

    public static void main(String[] args) {
        HelloWorldImplService service = new HelloWorldImplService();
        HelloWorldService stub = service.getHelloWorldImplPort();

        String response = stub.sayHello("Vipu");
        System.out.println("Response: " + response);
    }
}