package com.example.gradledemojava11.controller;

import com.example.gradledemojava11.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("message", "TEste");
        model.addAttribute("task", "taaask");
        model.addAttribute("greeting", new Greeting());

        return "home";
    }


    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, BindingResult bindingResult) {
        return "result";
    }
}
