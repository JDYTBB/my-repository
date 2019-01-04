package com.lcbw.controller;

import com.github.pagehelper.PageInfo;
import com.lcbw.common.PageBean;
import com.lcbw.pojo.UUser;
import com.lcbw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user-data")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user-info")
    public String userInfo(@RequestParam(defaultValue = "1") Integer currentPage, @RequestParam(defaultValue = "8") Integer pageSize, HttpServletRequest request, Model model){
        UserService userService = this.userService;
        PageBean<UUser> userList = userService.findAllUser(currentPage, pageSize);
        model.addAttribute("userList",userList);
        return "user-info";
    }
}
