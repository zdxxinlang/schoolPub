package com.yunuo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.easyui.ResultToViewDataUtil;
import com.yunuo.mapper.CategoryTMapper;
import com.yunuo.mapper.MomentsShowVMapper;
import com.yunuo.mapper.MomentsTMapper;
import com.yunuo.mapper.SchoolcscadeTMapper;
import com.yunuo.po.SchoolcscadeT;
import com.yunuo.po.SchoolcscadeTExample;
import com.yunuo.po.SchoolcscadeTExample.Criteria;
import com.yunuo.service.ItemCatService;
import com.yunuo.service.MomentsItemService;
import com.yunuo.service.SchoolItemCatService;

@Service
public class SchoolItemCatServiceImpl implements SchoolItemCatService{

	@Autowired
	private SchoolcscadeTMapper schoolcscadeTMapper;

	@Override
	public List<SchoolcscadeT> getSchoolItemCatByParentId(String id) {
		List<SchoolcscadeT> schoolcscadeTs = new ArrayList<>();
		SchoolcscadeTExample schoolcscadeTExample = new SchoolcscadeTExample();
		Criteria criteria = schoolcscadeTExample.createCriteria();
		criteria.andPidEqualTo(id);
		schoolcscadeTs = schoolcscadeTMapper.selectByExample(schoolcscadeTExample);
		return schoolcscadeTs;	
	}
}
