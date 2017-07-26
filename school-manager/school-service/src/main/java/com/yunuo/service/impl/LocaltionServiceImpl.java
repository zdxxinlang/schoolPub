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
import com.yunuo.mapper.LocationcscadeTMapper;
import com.yunuo.mapper.MomentsShowVMapper;
import com.yunuo.mapper.MomentsTMapper;
import com.yunuo.po.LocationcscadeT;
import com.yunuo.po.LocationcscadeTExample;
import com.yunuo.po.LocationcscadeTExample.Criteria;
import com.yunuo.service.ItemCatService;
import com.yunuo.service.LocaltionService;
import com.yunuo.service.MomentsItemService;

@Service
public class LocaltionServiceImpl implements LocaltionService{

	@Autowired
	private LocationcscadeTMapper locationcscadeTMapper;
	
	@Override
	public List<LocationcscadeT> getLocaltionByParentId(String id) {
		List<LocationcscadeT> resultList = new ArrayList<>();
		LocationcscadeTExample locationcscadeTExample = new LocationcscadeTExample();
		Criteria criteria = locationcscadeTExample.createCriteria();
		criteria.andPidEqualTo(id);
		
		resultList = locationcscadeTMapper.selectByExample(locationcscadeTExample);

		return resultList;
	}



}
