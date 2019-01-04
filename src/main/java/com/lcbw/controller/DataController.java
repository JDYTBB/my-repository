package com.lcbw.controller;

import com.lcbw.common.BaseData;
import com.lcbw.common.DataResult;
import com.lcbw.common.LabelInformation;
import com.lcbw.pojo.RfidData;
import com.lcbw.service.DataService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/data-data")
public class DataController {

    @Autowired
    private DataService dataService;

    @RequestMapping("/data-info")
    public String dataInfo(Model model){
        model.addAttribute("name","data-info");
        return "data-info";
    }

    public DataController() {
    }

    @RequestMapping("/view-labelInformation")
    public String labelInformation(Model model){
        DataResult<RfidData> dataResult = dataService.showLabelInfor();
        BaseData baseData = new BaseData(dataResult.getMileage(),dataResult.getTrack_bed_type(),dataResult.getFastener_type(),dataResult.getTemperature());
        model.addAttribute("baseData",baseData);
        model.addAttribute("labelList",dataResult);
        return "label-information";
    }

    @RequestMapping("/view-labelInforReport")
    public String labelInforReport(Model model){
        return "label-infor-report-statistics";
    }
}
