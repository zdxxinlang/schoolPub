package com.yunuo.mapper;

import com.yunuo.po.SchoolcscadeT;
import com.yunuo.po.SchoolcscadeTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchoolcscadeTMapper {
    int countByExample(SchoolcscadeTExample example);

    int deleteByExample(SchoolcscadeTExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SchoolcscadeT record);

    int insertSelective(SchoolcscadeT record);

    List<SchoolcscadeT> selectByExample(SchoolcscadeTExample example);

    SchoolcscadeT selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SchoolcscadeT record, @Param("example") SchoolcscadeTExample example);

    int updateByExample(@Param("record") SchoolcscadeT record, @Param("example") SchoolcscadeTExample example);

    int updateByPrimaryKeySelective(SchoolcscadeT record);

    int updateByPrimaryKey(SchoolcscadeT record);
}