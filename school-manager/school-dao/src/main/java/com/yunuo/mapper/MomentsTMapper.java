package com.yunuo.mapper;

import com.yunuo.po.MomentsT;
import com.yunuo.po.MomentsTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MomentsTMapper {
    int countByExample(MomentsTExample example);

    int deleteByExample(MomentsTExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MomentsT record);

    int insertSelective(MomentsT record);

    List<MomentsT> selectByExample(MomentsTExample example);

    MomentsT selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MomentsT record, @Param("example") MomentsTExample example);

    int updateByExample(@Param("record") MomentsT record, @Param("example") MomentsTExample example);

    int updateByPrimaryKeySelective(MomentsT record);

    int updateByPrimaryKey(MomentsT record);
}