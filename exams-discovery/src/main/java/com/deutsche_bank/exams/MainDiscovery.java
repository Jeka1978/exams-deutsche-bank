package com.deutsche_bank.exams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
@EnableEurekaServer
public class MainDiscovery {
    public static void main(String[] args) {
        SpringApplication.run(MainDiscovery.class);
    }
}
