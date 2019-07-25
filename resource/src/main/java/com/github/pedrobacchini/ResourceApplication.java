package com.github.pedrobacchini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.github.pedrobacchini")
public class ResourceApplication {

    public static void main(String[] args) { SpringApplication.run(ResourceApplication.class, args); }

}
