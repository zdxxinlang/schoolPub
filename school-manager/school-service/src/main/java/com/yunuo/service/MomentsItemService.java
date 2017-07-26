package com.yunuo.service;

import java.util.List;

import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.po.MomentsShowV;
import com.yunuo.po.MomentsT;

public interface MomentsItemService {
	public MomentsT getMomentById(Long id);
	public List<MomentsShowV> getItemListView();
}
