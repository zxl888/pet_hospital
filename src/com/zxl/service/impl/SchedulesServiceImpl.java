package com.zxl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.zxl.dao.SchedulesMapper;
import com.zxl.service.SchedulesService;

public class SchedulesServiceImpl implements SchedulesService {
	
	@Resource
	private SchedulesMapper sMapper;

	@Override
	public List<Map<String, Object>> selectSchDoc(String deptId, String docId) throws Exception {
		return sMapper.selectSchDoc(deptId, docId);
	}

}
