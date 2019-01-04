package com.lcbw.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class LoginController {
    protected final static Logger LOGGER = Logger.getLogger(LoginController.class);

    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public String userLogin(@RequestParam(name = "username") String userName, @RequestParam(name = "password") String passWord, HttpServletRequest request,Model model) {
        LOGGER.error("用户名："+userName+"密码："+passWord);
        return "main";
    }
}
