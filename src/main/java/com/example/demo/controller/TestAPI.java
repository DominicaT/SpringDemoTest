package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @program: demo-test
 * @author: Domi
 * @create: 2020-03-07 23:14
 **/
@RestController
@RequestMapping("/testApi")
public class TestAPI {

    public static int count = 0;

    @RequestMapping(value = "/getTest/{username}", method = RequestMethod.GET)
    public String getDemo(@PathVariable String username) {
        String i = "aaa";

        String result = username + i;
        return result;
    }

    @RequestMapping(value = "/getParam", method = RequestMethod.POST)
    public String getParam(@RequestParam String username, @RequestParam String age) {
        count++;

        String result = "接口是第：" + count + "次调用；用户名：" + username + "；年龄： " + age;

        return result;
    }

    @RequestMapping(value = "/postJson", method = RequestMethod.POST)
    @ResponseBody
    public Student postJson(@RequestBody Student s) {
        Student student = new Student();

        student.name = s.name;
        student.clazz = s.clazz;

        return student;
    }
}
