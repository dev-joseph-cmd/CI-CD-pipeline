package com.pm.ci_cd_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class CiCdDemoApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to CiCdDemoApplication!";

    }

    public static void main(String[] args) {
        SpringApplication.run(CiCdDemoApplication.class, args);
    }



}

