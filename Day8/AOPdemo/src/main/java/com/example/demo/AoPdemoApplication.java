package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.MyService;

@SpringBootApplication
public class AoPdemoApplication implements CommandLineRunner {

    @Autowired
    private MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(AoPdemoApplication.class, args);
    }

    @Override
    public void run(String[] args) {

        // Only call your service here
        myService.displayMessage();
    }
}