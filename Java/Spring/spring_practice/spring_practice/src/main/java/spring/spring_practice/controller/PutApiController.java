package spring.spring_practice.controller;

import org.springframework.web.bind.annotation.*;
import spring.spring_practice.dto.PutRequestDto;

@RestController
@RequestMapping("/api/put")
public class PutApiController {

    @PutMapping("/cars/{userId}")
    public void put(@RequestBody PutRequestDto requestData, @PathVariable(name="userId") Long userId) {
        System.out.println(requestData);
    }
}
