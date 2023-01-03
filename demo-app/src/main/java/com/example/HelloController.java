package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;

@RestController
public class HelloController {

    @Value("${target:local}")
    String target;

    @Autowired
    private Environment env;

    @GetMapping("/hello") 
    public String hello()
    {
<<<<<<< HEAD
        // System.out.println("Database URL:" + env.getProperty("spring.datasource.url"));
        // System.out.println("Database URL:" + env.getProperty("spring.datasource.user"));
=======
        // System.out.println("Database URL:" + env.getProperty("spring.datasource.url"));
        // System.out.println("Database URL:" + env.getProperty("spring.datasource.user"));
        // 
>>>>>>> 7af0ae1eb89f5fd912a78591907cb5d13b1231a3
        
        return String.format("Hello from your %s environment !!! %s", target, System.getProperty("user.home"));
    }
}
