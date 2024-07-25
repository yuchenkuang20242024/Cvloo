package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ author Vanellope von Schweetz
 */
@Controller
public class DemoControler {
    @GetMapping("/first")
    String first(){
        return "hello world!";
    }
}
