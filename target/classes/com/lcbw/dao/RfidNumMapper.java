package com.lcbw.dao;

import com.lcbw.pojo.RfidNum;
import com.lcbw.pojo.RfidNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RfidNumMapper {

    List<RfidNum> selectAllLabel();

    long countByExample(RfidNumExample example);

    int deleteByExample(RfidNumExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RfidNum record);

    int insertSelective(RfidNum record);

    List<RfidNum> selectByExample(RfidNumExample example);

    RfidNum selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RfidNum record, @Param("example") RfidNumExample example);

    int updateByExample(@Param("record") RfidNum record, @Param("example") RfidNumExample example);

    int updateByPrimaryKeySelective(RfidNum record);

    int updateByPrimaryKey(RfidNum record);
}