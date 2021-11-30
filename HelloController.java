package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bin.annotation.RestController;

@RestController;
public class HelloController {
  
  @GetMapping("/")
  public String index() {
   
    return "Greetings from Spring Boot!";
    
  }
  //To be implemented in details. Jian, 11.30.2021
  
  //Add another comment line.
}
