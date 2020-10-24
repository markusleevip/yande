package com.markus.yande.userface.home;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {

    @RequestMapping()
    public String index() {
        return "Hello World!";
    }

}
