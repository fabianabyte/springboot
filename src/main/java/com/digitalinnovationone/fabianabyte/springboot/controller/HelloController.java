package com.digitalinnovationone.fabianabyte.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
   public String helloMessage(){
        return "Hello Fabianabyte!";
    }
    @GetMapping("/teste")
   public String meMome(){
        return "No teste!";
    }


}
