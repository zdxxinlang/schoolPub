package com.yunuo.mapper;

import com.yunuo.po.MomentsShowV;
import com.yunuo.po.MomentsShowVExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentsShowVMapper {
    int countByExample(MomentsShowVExample example);

    int deleteByExample(MomentsShowVExample example);

    int insert(MomentsShowV record);

    int insertSelective(MomentsShowV record);

    List<MomentsShowV> selectByExample(MomentsShowVExample example);

    int updateByExampleSelective(@Param("record") MomentsShowV record, @Param("example") MomentsShowVExample example);

    int updateByExample(@Param("record") MomentsShowV record, @Param("example") MomentsShowVExample example);
}