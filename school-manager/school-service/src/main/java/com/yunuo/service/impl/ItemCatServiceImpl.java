package com.yunuo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.easyui.ResultToViewDataUtil;
import com.yunuo.mapper.CategoryTMapper;
import com.yunuo.mapper.MomentsShowVMapper;
import com.yunuo.mapper.MomentsTMapper;
import com.yunuo.po.CategoryT;
import com.yunuo.po.CategoryTExample;
import com.yunuo.po.CategoryTExample.Criteria;
import com.yunuo.service.ItemCatService;
import com.yunuo.service.MomentsItemService;

@Service
public class ItemCatServiceImpl implements ItemCatService{


	@Autowired
	private CategoryTMapper categoryTMapper;

	@Override
	public List<CategoryT> getItemCatByParentId(String pid) {
		List<CategoryT> resultList = new ArrayList<>();
		CategoryTExample categoryTExample = new CategoryTExample();
		Criteria criteria = categoryTExample.createCriteria();
		criteria.andPidEqualTo(pid);
		
						
		resultList = categoryTMapper.selectByExample(categoryTExample);

		System.out.println("ItemCatServiceImpl ==="+pid);
		for (CategoryT categoryT : resultList) {
			System.out.println("pp"+categoryT.toString());
		}
		return resultList;
	}
	




}
