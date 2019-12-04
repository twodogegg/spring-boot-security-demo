package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: twodogegg
 * DATE: 2019-12-03 14:07
 */
@Controller
public class UserController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello controller";
    }
}
