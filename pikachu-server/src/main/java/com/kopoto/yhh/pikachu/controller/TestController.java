package com.kopoto.yhh.pikachu.controller;

import com.kopoto.yhh.pikachu.spi.TestSpi;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestSpi {
    @Override
    public int test() {
        return 0;
    }
}
