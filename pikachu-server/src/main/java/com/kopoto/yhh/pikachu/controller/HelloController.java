package com.kopoto.yhh.pikachu.controller;

import com.kopoto.yhh.pikachu.spi.HelloSpi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloSpi {
    public int test() {
        return 0;
    }

    @RequestMapping("/te")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}



