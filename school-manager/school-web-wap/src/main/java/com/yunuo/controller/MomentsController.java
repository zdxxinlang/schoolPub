package com.yunuo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.xmlrpc.base.Array;
import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.easyui.ResultToViewDataUtil;
import com.yunuo.po.MomentsShowV;
import com.yunuo.po.MomentsT;
import com.yunuo.service.MomentsItemService;

@Controller
public class MomentsController {
	@Autowired
	private MomentsItemService momentsItemService;
	
	ResultToViewDataUtil resultToViewDataUtil ;
	
	@RequestMapping("/momentsMsg/{id}")
	@ResponseBody
	private MomentsT getMomentById(@PathVariable Long id){
		MomentsT momentsT = momentsItemService.getMomentById(id);
		return momentsT;
	}
	
	@RequestMapping("/momentsMsg/list")
	@ResponseBody
	public EasyUIDataGridResult getItemListView(Integer page, Integer rows) {
		List<MomentsShowV> momentListViewList = new ArrayList<MomentsShowV>();
		resultToViewDataUtil = new ResultToViewDataUtil();
		
		momentListViewList = momentsItemService.getItemListView();
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result = resultToViewDataUtil.toEasyuiDatagridPagerViewData(page, rows, momentListViewList);
		return result;
	}
}
