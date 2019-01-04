package com.lcbw.dao;

import com.lcbw.pojo.UUserRole;
import com.lcbw.pojo.UUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserRoleMapper {
    long countByExample(UUserRoleExample example);

    int deleteByExample(UUserRoleExample example);

    int insert(UUserRole record);

    int insertSelective(UUserRole record);

    List<UUserRole> selectByExample(UUserRoleExample example);

    int updateByExampleSelective(@Param("record") UUserRole record, @Param("example") UUserRoleExample example);

    int updateByExample(@Param("record") UUserRole record, @Param("example") UUserRoleExample example);
}