package com.example.demo.controller;

import com.example.demo.singleton.LogManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/log")
public class LogController {

    @GetMapping("/write")
    public String writeLog(@RequestParam String message) {
        LogManager.getInstance().log(message);
        return "Logged message: " + message;
    }
}