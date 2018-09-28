package com.example.socket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootSocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSocketApplication.class, args);
        //起socket服务
        SocketServer server = new SocketServer();
        server.startSocketServer(8088);
    }
}
