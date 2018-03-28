package com.traveler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/main")
public class MainController {

    @RequestMapping(value = "/start")
    public String mainPage() {
        return "mainPage";
    }

    @RequestMapping(value = "/map")
    public String mapPage() {
        return "mapPage";
    }

    @RequestMapping(value = "/history")
    public String historyPage() {
        return "historyPage";
    }

    @RequestMapping(value = "/plan")
    public String planPage() {
        return "planPage";
    }
}
