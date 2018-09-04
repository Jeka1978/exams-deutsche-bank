package com.deutsche_bank.exams.math;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
@EnableEurekaClient
public class MainMath {
    public static void main(String[] args) {
        SpringApplication.run(MainMath.class);
    }
}
