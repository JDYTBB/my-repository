package com.lcbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jumpPage")
public class PageJunpController {
    @RequestMapping("/goToLogin")
    public String showLogin() {
        return "login";
    }
}
