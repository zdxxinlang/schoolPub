package com.yunuo.mapper;

import com.yunuo.po.CategoryT;
import com.yunuo.po.CategoryTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CategoryTMapper {
    int countByExample(CategoryTExample example);

    int deleteByExample(CategoryTExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CategoryT record);

    int insertSelective(CategoryT record);

    List<CategoryT> selectByExample(CategoryTExample example);

    CategoryT selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CategoryT record, @Param("example") CategoryTExample example);

    int updateByExample(@Param("record") CategoryT record, @Param("example") CategoryTExample example);

    int updateByPrimaryKeySelective(CategoryT record);

    int updateByPrimaryKey(CategoryT record);
}