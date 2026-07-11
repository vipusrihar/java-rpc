package com.hellorpc;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.hellorpc.HelloWorldService")
public class HelloWorldImpl implements HelloWorldService {

    @Override
    public String sayHello(String name) {
        System.out.println("Server received: " + name);
        return "Hello, " + name + "!";
    }
}

