package com.outlook.philiphyw.todomanager.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.outlook.philiphyw.todomanager"})
public class RestfulWebServicesApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestfulWebServicesApplication.class,args);
    }
}
