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
import com.yunuo.service.MomentsItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemCatService itemCatService;
	
	@RequestMapping("/item/cat/list")
	@ResponseBody
	public List<LocalCatPojo> getItemListView(@RequestParam(value="id",defaultValue="0") String pid) {
		List<LocalCatPojo> resultList = new ArrayList<>();

		System.out.println("/item/cat/list");
		List<CategoryT> categoryTs = itemCatService.getItemCatByParentId(pid);
		LocalCatPojo localCatPojo;
		for (int i = 0; i < categoryTs.size(); i++) {
			localCatPojo = new LocalCatPojo();
			localCatPojo.setId(categoryTs.get(i).getCatid());
			localCatPojo.setText(categoryTs.get(i).getName());
			//localCatPojo.setParentID(locationcscadeTs.get(i).getPid());
			resultList.add(localCatPojo);
		}
		
		for (LocalCatPojo dd : resultList) {
			System.out.println(dd.toString());
		}

		return resultList;
	}
}
