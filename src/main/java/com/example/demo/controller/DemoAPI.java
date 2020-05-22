package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @program: demo-test
 * @author: Domi
 * @create: 2020-03-07 12:25
 **/
@RestController
@RequestMapping("/guowang/demoAPI")
public class DemoAPI {
    @RequestMapping(value = "/getDemo/{userName}", method = RequestMethod.GET)
    public String getDemo(@PathVariable String userName) {
        String i = "aaaaa";
        userName = userName + i;
        return "您输入的数据是：" + userName;
    }

    public static int count = 0;

    @RequestMapping(value = "/postDemo", method = RequestMethod.POST)
    public String postDemo(@RequestParam String userName) {
        count++;
        String result = "接口是第" + count + "次被调用，你的用户名是：" + userName;

        return result;
    }

    @RequestMapping(value = "/postJson", method = RequestMethod.POST)
    @ResponseBody
    public  Student postDemo(@RequestBody Student s) {
        Student student = new Student();
        student.name = s.name;
        student.clazz = "二年二班";

        return student;
    }
}
