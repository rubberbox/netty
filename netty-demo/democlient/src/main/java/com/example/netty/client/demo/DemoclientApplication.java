package com.example.netty.client.demo;

import com.example.netty.client.demo.client.EchoClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoclientApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DemoclientApplication.class, args);
        EchoClient client = new EchoClient("127.0.0.1",9010);
        client.start();
    }
}
