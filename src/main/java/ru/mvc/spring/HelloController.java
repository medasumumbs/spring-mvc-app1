package ru.mvc.spring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @GetMapping(value = "/hello")
    public String sayHello() {
        return "hello_world";
    }
}
