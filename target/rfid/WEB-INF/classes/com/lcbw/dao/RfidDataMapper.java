package com.lcbw.dao;

import com.lcbw.pojo.RfidData;
import com.lcbw.pojo.RfidDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RfidDataMapper {

    List<RfidData> selectLabelDataByYear();

    long countByExample(RfidDataExample example);

    int deleteByExample(RfidDataExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RfidData record);

    int insertSelective(RfidData record);

    List<RfidData> selectByExampleWithBLOBs(RfidDataExample example);

    List<RfidData> selectByExample(RfidDataExample example);

    RfidData selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RfidData record, @Param("example") RfidDataExample example);

    int updateByExampleWithBLOBs(@Param("record") RfidData record, @Param("example") RfidDataExample example);

    int updateByExample(@Param("record") RfidData record, @Param("example") RfidDataExample example);

    int updateByPrimaryKeySelective(RfidData record);

    int updateByPrimaryKeyWithBLOBs(RfidData record);

    int updateByPrimaryKey(RfidData record);
}