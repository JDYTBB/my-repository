package com.lcbw.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lcbw.common.PageBean;
import com.lcbw.dao.RfidNumMapper;
import com.lcbw.pojo.RfidNum;
import com.lcbw.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {
    @Autowired
    private RfidNumMapper rfidNumMapper;

    @Override
    public PageBean<RfidNum> findAllLabel(Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage,pageSize);
        List<RfidNum> rfidNumsList = rfidNumMapper.selectAllLabel();
        PageInfo<RfidNum> pageInfo = new PageInfo<>(rfidNumsList);

        PageBean<RfidNum> pageBean = new PageBean<>(currentPage,pageSize,(int) pageInfo.getTotal());
        pageBean.setData(rfidNumsList);

        return pageBean;
    }
}
