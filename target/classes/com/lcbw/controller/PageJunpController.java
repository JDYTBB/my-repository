package com.lcbw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/jsp")
public class PageJunpController {
    /**
     * index.jsp跳转至login.jsp
     * @return String
     */
    @RequestMapping("/goToLogin")
    public String showLogin() {
        return "login";
    }

    @RequestMapping("/goTop")
    public String goTop(){
        return "top";
    }

    @RequestMapping("/goFooter")
    public String goBooter(){
        return "footer";
    }

    @RequestMapping("/goLeft")
    public String goLeft(){
        return "left";
    }

    @RequestMapping("/goIndex")
    public String goIndex(){
        return "index";
    }

    @RequestMapping("/dropOut")
    public ModelAndView goMain(ModelAndView mv){
        mv.setViewName("login");
        return mv;
    }
}


