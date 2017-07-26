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
import com.yunuo.comm.LocalCatPojo;
import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.easyui.EasyUILazyTreeResult;
import com.yunuo.easyui.ResultToViewDataUtil;
import com.yunuo.po.CategoryT;
import com.yunuo.po.LocationcscadeT;
import com.yunuo.po.MomentsShowV;
import com.yunuo.po.MomentsT;
import com.yunuo.po.SchoolcscadeT;
import com.yunuo.service.ItemCatService;
import com.yunuo.service.LocaltionService;
import com.yunuo.service.MomentsItemService;
import com.yunuo.service.SchoolItemCatService;

@Controller
public class SchoolItemController {
	@Autowired
	private SchoolItemCatService schoolItemCatService;
	
	@RequestMapping("/school/cat/list")
	@ResponseBody
	public List<LocalCatPojo> getSchoolItemList(@RequestParam(value="id",defaultValue="0") String id) {
		List<LocalCatPojo> resultList = new ArrayList<>();

		List<SchoolcscadeT> schoolcscadeTs = schoolItemCatService.getSchoolItemCatByParentId(id);
		
	
		LocalCatPojo LocalCatPojo;
		for (int i = 0; i < schoolcscadeTs.size(); i++) {
			LocalCatPojo = new LocalCatPojo();
			LocalCatPojo.setId(schoolcscadeTs.get(i).getSchoolid());
			LocalCatPojo.setText(schoolcscadeTs.get(i).getName());
			//LocalCatPojo.setParentID(schoolcscadeTs.get(i).getPid());
			resultList.add(LocalCatPojo);
		}
		
		for (LocalCatPojo result : resultList) {
			System.out.println(result.toString());
		}
		return resultList;
	}
}
