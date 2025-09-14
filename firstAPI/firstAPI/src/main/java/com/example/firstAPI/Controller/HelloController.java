package com.example.firstAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired; 
import com.example.firstAPI.Service.HelloService; 

@RestController
public class HelloController {

    @Autowired
    HelloService service;

    @GetMapping("/")
    public String greet(){
        return service.greet();   
    }
    
}