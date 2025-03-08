package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/hello")
    public String Hello (){
        return "hello world";

    }
    @GetMapping("api/hello")
    public String Hellomone (String nome){
        return "hello world"+nome;
    }
}