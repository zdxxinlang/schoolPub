package com.yunuo.mapper;

import com.yunuo.po.LocationcscadeT;
import com.yunuo.po.LocationcscadeTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LocationcscadeTMapper {
    int countByExample(LocationcscadeTExample example);

    int deleteByExample(LocationcscadeTExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LocationcscadeT record);

    int insertSelective(LocationcscadeT record);

    List<LocationcscadeT> selectByExample(LocationcscadeTExample example);

    LocationcscadeT selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LocationcscadeT record, @Param("example") LocationcscadeTExample example);

    int updateByExample(@Param("record") LocationcscadeT record, @Param("example") LocationcscadeTExample example);

    int updateByPrimaryKeySelective(LocationcscadeT record);

    int updateByPrimaryKey(LocationcscadeT record);
}