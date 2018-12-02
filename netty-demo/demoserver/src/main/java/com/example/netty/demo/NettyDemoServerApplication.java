package com.example.netty.demo;

import com.example.netty.demo.server.EchoServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyDemoServerApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(NettyDemoServerApplication.class, args);
        EchoServer server = new EchoServer(9010);
        server.start();
    }
}
