package com.deutsche_bank.exams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
@EnableEurekaClient
public class ExaminatorMain {
    public static void main(String[] args) {
        SpringApplication.run(ExaminatorMain.class);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }





}
