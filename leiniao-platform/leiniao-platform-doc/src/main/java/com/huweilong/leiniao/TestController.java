package com.huweilong.leiniao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Value("${a1: 0}")
    private String a1;

    @GetMapping("/")
    public String index() {
        System.out.println(a1);
        return "Hello World!";
    }
}
