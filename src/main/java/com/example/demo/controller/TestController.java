package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo-test
 * @author: Domi
 * @create: 2020-03-07 12:12
 **/
@RestController
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    String getTest() {
        return "test";
    }
}
