package com.berktug.hellospring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public  String home(){
        return "test ";
    }
}
