package com.godwin.fleetmsv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home(){
        return "index.html";
    }

    @GetMapping("/widget")
    public String widget(){
        return "widgets";
    }
}
