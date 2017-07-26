package com.yunuo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunuo.easyui.EasyUIDataGridResult;
import com.yunuo.easyui.ResultToViewDataUtil;
import com.yunuo.mapper.MomentsShowVMapper;
import com.yunuo.mapper.MomentsTMapper;
import com.yunuo.po.MomentsShowV;
import com.yunuo.po.MomentsShowVExample;
import com.yunuo.po.MomentsT;
import com.yunuo.po.MomentsTExample;
import com.yunuo.po.MomentsTExample.Criteria;
import com.yunuo.service.MomentsItemService;

@Service
public class MomentsItemServiceImpl implements MomentsItemService {

	@Autowired
	private MomentsTMapper momentsTMapper;
	
	@Autowired
	private MomentsShowVMapper momentsShowVMapper;
	
	ResultToViewDataUtil resultToViewDataUtil ;
	
	@Override
	public MomentsT getMomentById(Long id) {
		MomentsTExample momentsTExample = new MomentsTExample();
		Criteria criteria = momentsTExample.createCriteria();
		criteria.andIdEqualTo(id);
						
		MomentsT resultMomentsT = new MomentsT();
		List<MomentsT> momentsTList = momentsTMapper.selectByExample(momentsTExample);
		if (momentsTList!=null && momentsTList.size()>0) {
			resultMomentsT = momentsTList.get(0);
		}
		return resultMomentsT;
	}


	@Override
	public List<MomentsShowV> getItemListView() {
		MomentsShowVExample example = new MomentsShowVExample();//执行查询
		List<MomentsShowV> list = momentsShowVMapper.selectByExample(example);
		return list;
	}



}
