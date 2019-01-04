package com.lcbw.service;

import com.lcbw.common.DataResult;
import com.lcbw.common.LabelInformation;
import com.lcbw.pojo.RfidData;

public interface DataService {
    DataResult<RfidData> showLabelInfor();
}
