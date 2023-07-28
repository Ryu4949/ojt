package spring.spring_practice.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path="/hello")
    public String Hello() {
        return "get Hello";
    }

    @RequestMapping(path="/hi", method= RequestMethod.GET)
    public String hi() {
        return "hi";
    }

    @GetMapping("/path-variable/{id}")
    public String pathVariable(@PathVariable(name="id") String pathName) {
        System.out.println("PathVariable: " + pathName);
        return pathName;
    }

    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+" "+email+" "+age;

    }

}
