package com.hellorpc;

import jakarta.jws.WebService;

@WebService(
        endpointInterface = "com.hellorpc.HelloWorldService",
        serviceName = "HelloWorld",
        portName = "HelloWorldPort"
)
public class HelloWorldImpl implements HelloWorldService {

    @Override
    public String sayHello(String name) {
        System.out.println("Server received: " + name);
        return "Hello, " + name + "!";
    }
}

