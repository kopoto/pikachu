package com.kopoto.yhh.pikachu.controller;

import com.kopoto.yhh.pikachu.dao.StudentDao;
import com.kopoto.yhh.pikachu.entity.Student;
import com.kopoto.yhh.pikachu.spi.HelloSpi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements HelloSpi {
    public int test() {
        return 0;
    }

    @Autowired
    private StudentDao studentDao;

    @RequestMapping("/index")
    public String index() {
        Student one = studentDao.one(1);
        return "Greetings from Spring Boot!";
    }
}



