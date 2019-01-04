package com.lcbw.controller;

import com.lcbw.common.PageBean;
import com.lcbw.pojo.RfidNum;
import com.lcbw.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/lable-data")
public class LabelController {

    @Autowired
    private LabelService labelService;

    @RequestMapping("/label-info")
    public String labelInfo(@RequestParam(defaultValue = "1")Integer currentPage, @RequestParam(defaultValue = "10")Integer pageSize, HttpServletRequest request, Model model){
        PageBean<RfidNum> labelList = labelService.findAllLabel(currentPage, pageSize);
        model.addAttribute("labelList",labelList);
        return "label-info";
    }

}
