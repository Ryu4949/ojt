package main.java.com.example.exception.controller;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import main.java.com.example.exception.dto.User;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("")
    public User get(@RequestParam String name, @RequestParam int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);

        return user;
    }

    @PostMapping("")
    public User post(@Valid @RequestBody User user) {
        System.out.println(user);
        return user;
    }
}
