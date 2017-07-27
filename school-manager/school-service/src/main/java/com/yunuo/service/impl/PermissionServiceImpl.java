package com.yunuo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunuo.mapper.PermissionTMapper;
import com.yunuo.po.PermissionT;
import com.yunuo.po.PermissionTExample;
import com.yunuo.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService{

	@Autowired
	private PermissionTMapper permissionTMapper ;

	@Override
	public List<PermissionT> getAllMomentPermission() {
		List<PermissionT> resultList = new ArrayList<>();
		PermissionTExample example = new PermissionTExample();
		resultList = permissionTMapper.selectByExample(example);

		return resultList;
	}


}
