package spring.spring_practice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.spring_practice.dto.UserDto;

@RequestMapping("/api/all")
@RestController
public class ApisController {

    //text
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    //json
    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto user) {
        return user;
    }

    //ResponseEntity
    @PutMapping("/put")
    public ResponseEntity<UserDto> put(@RequestBody UserDto user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
