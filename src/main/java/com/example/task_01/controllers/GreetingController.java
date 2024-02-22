package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public String newGreeting(@RequestParam String time){
        Greeting greeting = new Greeting("Colin", "afternoon");
        return String.format("Good %s %s!", time, greeting.getName());
    }
}
