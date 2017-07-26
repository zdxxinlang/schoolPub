package com.yunuo.service;

import java.util.List;

import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.po.CategoryT;
import com.yunuo.po.LocationcscadeT;
import com.yunuo.po.MomentsShowV;
import com.yunuo.po.MomentsT;

public interface LocaltionService {
	public List<LocationcscadeT> getLocaltionByParentId(String id);
}
