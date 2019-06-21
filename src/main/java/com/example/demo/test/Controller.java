package com.example.demo.test;

import com.example.demo.service.testServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private testServiceImpl testService;
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "你个楞球货";
    }
    @RequestMapping("")
    public String hello2(){
        return "images/0.jpg";
    }
    @RequestMapping("/hello3")
    public String hello3(){
        return "addstu";
    }

    @GetMapping("/list")
    @ResponseBody
    public List<Map<String,Object>> lsit(){
        return testService.list();
    }
}
