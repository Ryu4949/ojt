package spring.spring_practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 class는 REST API를 처리하기 위한 Controller라는 의미
@RequestMapping("/api") // URI를 지정해주는 Annotation
public class ApiController {

    @GetMapping("/hello") // http://localhost:8080/api/hello
    public String hello() {
        return "hello spring boot";
    }
}
