package com.yunuo.service;

import java.util.List;

import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.po.CategoryT;
import com.yunuo.po.MomentsShowV;
import com.yunuo.po.MomentsT;
import com.yunuo.po.SchoolcscadeT;

public interface SchoolItemCatService {
	public List<SchoolcscadeT> getSchoolItemCatByParentId(String id);
}
