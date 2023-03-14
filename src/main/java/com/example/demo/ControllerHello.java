package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("hello")
public class ControllerHello {

    @GetMapping("say")
    public String sayHello(@RequestParam String name, Model model){
        model.addAttribute("hello", "World " + name);
        return "hello";
    }

    @GetMapping("date")
    public String sayDate(Model model){
        LocalDate date = LocalDate.now();
        model.addAttribute("hello", "Dato i dag: " + date);
        return "hello";
    }
}
