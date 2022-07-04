package com.example.hellojenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping
    public String sayHello(){
        return "hell, jenkinssssss612312312312312141241241241241243123123556755s";
    }
}
