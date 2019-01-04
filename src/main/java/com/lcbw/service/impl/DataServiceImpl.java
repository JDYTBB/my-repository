package com.lcbw.service.impl;

import com.lcbw.common.BaseData;
import com.lcbw.common.DataResult;
import com.lcbw.common.LabelInformation;
import com.lcbw.dao.RfidDataMapper;
import com.lcbw.pojo.RfidData;
import com.lcbw.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private RfidDataMapper rfidDataMapper;

    @Override
    public DataResult<RfidData> showLabelInfor() {
        List<RfidData> rfidDataList = rfidDataMapper.selectLabelDataByYear();
        DataResult<RfidData> dataResult = new DataResult<>(rfidDataList.get(0).getMileage(), rfidDataList.get(0).getTrackBedType(), rfidDataList.get(0).getFastenerType(), rfidDataList.get(0).getTemperature());
        dataResult.setData(rfidDataList);

        return dataResult;
    }
}
