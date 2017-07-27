package com.yunuo.mapper;

import com.yunuo.po.PermissionT;
import com.yunuo.po.PermissionTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionTMapper {
    int countByExample(PermissionTExample example);

    int deleteByExample(PermissionTExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PermissionT record);

    int insertSelective(PermissionT record);

    List<PermissionT> selectByExample(PermissionTExample example);

    PermissionT selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PermissionT record, @Param("example") PermissionTExample example);

    int updateByExample(@Param("record") PermissionT record, @Param("example") PermissionTExample example);

    int updateByPrimaryKeySelective(PermissionT record);

    int updateByPrimaryKey(PermissionT record);
}