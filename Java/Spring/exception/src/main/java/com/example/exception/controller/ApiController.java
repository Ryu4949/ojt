package main.java.com.example.exception.controller;


import org.springframework.web.bind.annotation.*;
import main.java.com.example.exception.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("")
    public User get(@RequestParam String name, @RequestParam int age) {

    }

    @PostMapping("")
    public User post(@RequestBody User user) {

    }
}
