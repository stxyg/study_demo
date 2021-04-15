package com.cnn.casdemo;

import org.jasig.cas.client.boot.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableCasClient
@SpringBootApplication
public class CasDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasDemoApplication.class, args);
    }

}
