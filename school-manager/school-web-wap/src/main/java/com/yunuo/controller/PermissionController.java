package com.yunuo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.xmlrpc.base.Array;
import com.yunuo.comm.LocalCatPojo;
import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.easyui.EasyUILazyTreeResult;
import com.yunuo.easyui.ResultToViewDataUtil;
import com.yunuo.po.CategoryT;
import com.yunuo.po.LocationcscadeT;
import com.yunuo.po.MomentsShowV;
import com.yunuo.po.MomentsT;
import com.yunuo.po.PermissionT;
import com.yunuo.service.ItemCatService;
import com.yunuo.service.MomentsItemService;
import com.yunuo.service.PermissionService;

@Controller
public class PermissionController {
	@Autowired
	private PermissionService permissionService;
	
	@RequestMapping("/level/moments/getLevelList")
	@ResponseBody
	public List<PermissionT> getAllMomentPerission() {
		List<PermissionT> permissionTs = permissionService.getAllMomentPermission();
		return permissionTs;
	}
}
