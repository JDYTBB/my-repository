package com.lcbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    public ModelAndView userLogin(HttpServletRequest request,ModelAndView mv) {
        mv.setViewName("home");
        return mv;
    }
}
