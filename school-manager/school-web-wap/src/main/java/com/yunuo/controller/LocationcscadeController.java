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
import com.yunuo.service.ItemCatService;
import com.yunuo.service.LocaltionService;
import com.yunuo.service.MomentsItemService;

@Controller
public class LocationcscadeController {
	@Autowired
	private LocaltionService localtionService;
	
	@RequestMapping("/localtion/cat/list")
	@ResponseBody
	public List<LocalCatPojo> getLocationList(@RequestParam(value="id",defaultValue="0") String pid) {
		List<LocalCatPojo> resultList = new ArrayList<>();

		List<LocationcscadeT> locationcscadeTs = localtionService.getLocaltionByParentId(pid);
		LocalCatPojo localCatPojo;
		for (int i = 0; i < locationcscadeTs.size(); i++) {
			localCatPojo = new LocalCatPojo();
			localCatPojo.setId(locationcscadeTs.get(i).getPlaceid());
			localCatPojo.setText(locationcscadeTs.get(i).getName());
			resultList.add(localCatPojo);
		}
		return resultList;
	}
}
