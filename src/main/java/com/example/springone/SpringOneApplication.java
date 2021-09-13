package com.example.springone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringOneApplication.class, args);
    }

    @GetMapping("/hello")
    public String main() {
        return "index.jsp";
    }

    @GetMapping("/test")
    public String test() {
        return "test.jsp";
    }

}
