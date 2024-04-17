package ru.mvc.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "surname", required = false) String surname,
                            Model model) {
        model.addAttribute("message","hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }

    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam(value = "a", required = true) double a,
                                 @RequestParam(value = "b", required = true) double b,
                                 @RequestParam(value = "action", required = true) String action,
                                 Model model) {
        double result = 0;
        if (action.equalsIgnoreCase("multiplication")) {
            result = a * b;
        } else if (action.equalsIgnoreCase("addition")) {
            result = a + b;
        } else if (action.equalsIgnoreCase("subtraction")) {
            result = a - b;
        } else if (action.equalsIgnoreCase("division")) {
            result = a / b;
        }
        model.addAttribute("result", result);
        return "first/calculator";
    }
}
