package com.yunuo.easyui;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


public class ResultToViewDataUtil {
	public EasyUIDataGridResult toEasyuiDatagridPagerViewData(int page, int rows,List<?> dataList){
		PageHelper.startPage(page, rows);//分页处理		
		PageInfo<?> pageInfo = new PageInfo<>(dataList);//返回处理结果
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setTotal(pageInfo.getTotal());
		result.setRows(dataList);			
		return result;
	}
}
