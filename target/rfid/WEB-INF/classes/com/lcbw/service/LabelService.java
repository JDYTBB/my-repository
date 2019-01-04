package com.lcbw.service;

import com.lcbw.common.PageBean;
import com.lcbw.pojo.RfidNum;

public interface LabelService {
    PageBean<RfidNum> findAllLabel(Integer currentPage,Integer pageSize);
}
