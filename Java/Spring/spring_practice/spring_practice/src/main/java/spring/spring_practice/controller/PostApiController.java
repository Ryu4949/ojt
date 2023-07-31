package spring.spring_practice.controller;

import org.springframework.web.bind.annotation.*;
import spring.spring_practice.dto.PostRequestDto;

import java.util.Map;

@RestController
@RequestMapping("/api/post")
public class PostApiController {

//    @PostMapping("/post")
//    public void post(@RequestBody Map<String, Object> requestData) {
//        requestData.forEach((key, value) -> {
//            System.out.println("key: "+key);
//            System.out.println("value: "+value);
//        });
//
//    }

    @PostMapping("/info")
    public void post(@RequestBody PostRequestDto requestData) {
        System.out.println(requestData);
    }

}
