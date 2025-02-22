package com.alexisgeoffrey.pictovate;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
    
    @GetMapping("/index.html")
    public String index() {
        return "index";
    }
}
