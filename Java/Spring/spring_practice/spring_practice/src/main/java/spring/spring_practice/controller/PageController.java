package spring.spring_practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import spring.spring_practice.dto.UserDto;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    // Response Entity

    @ResponseBody
    @GetMapping("/user")
    public UserDto user() {
        var user = new UserDto();
        user.setName("steve");
        user.setAddress("서울시 마포구");
        return user;
    }
}
