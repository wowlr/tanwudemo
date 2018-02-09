package com.tanwuapp.tanwudemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TanwudemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TanwudemoApplication.class, args);
    }

    @RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
    public String index(){
        return "Hello Spring Boo1111t!";
    }
}
