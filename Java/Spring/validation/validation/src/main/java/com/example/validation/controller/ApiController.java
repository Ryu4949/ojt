package com.example.validation.controller;

import com.example.validation.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @PostMapping("/user")
    public ResponseEntity user(@RequestBody User user) {
        System.out.println(user);

        // 검증을 거쳐야할 데이터가 많아지면 점점 코드가 복잡해짐
        if(user.getAge() >= 90){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(user);
        }
        return ResponseEntity.ok(user);
    }

}
