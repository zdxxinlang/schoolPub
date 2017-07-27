package com.yunuo.service;

import java.util.List;

import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.po.CategoryT;
import com.yunuo.po.LocationcscadeT;
import com.yunuo.po.MomentsShowV;
import com.yunuo.po.MomentsT;
import com.yunuo.po.PermissionT;

public interface PermissionService {
	public List<PermissionT> getAllMomentPermission();
}
