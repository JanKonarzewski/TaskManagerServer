package com.konarzewski;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/index")
    public String index() {
        System.out.println("WorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorksWorks");
        return "index";
    }
}
