package com.lcbw.service;

import com.github.pagehelper.PageInfo;
import com.lcbw.common.PageBean;
import com.lcbw.pojo.UUser;

public interface UserService {
    PageBean<UUser> findAllUser(Integer currentPage, Integer pageSize);
}
