package com.lcbw.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lcbw.common.PageBean;
import com.lcbw.dao.UUserMapper;
import com.lcbw.pojo.UUser;
import com.lcbw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UUserMapper uUserMapper;

    @Override
    public PageBean<UUser> findAllUser(Integer currentPage, Integer pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        List<UUser> userList = uUserMapper.selectAllUser();
        PageInfo<UUser> pageInfo = new PageInfo<>(userList);

        PageBean<UUser> pageBean = new PageBean<>(currentPage, pageSize, (int) pageInfo.getTotal());
        pageBean.setData(userList);
        return pageBean;
    }
}
