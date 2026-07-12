package client;

public class HelloWorldClient {

    public static void main(String[] args) {

        HelloWorld service = new HelloWorld();
        HelloWorldService port = service.getHelloWorldPort();

        String response = port.sayHello("Vipu");

        System.out.println(response);
    }
}