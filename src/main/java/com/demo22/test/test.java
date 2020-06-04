package com.demo22.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {

    @RequestMapping("/test")
    @ResponseBody
    public String test22() {
        return "超哥，我是小杜！";
    }
}
