package com.zxl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxl.dao.DeptMapper;
import com.zxl.entity.Dept;
import com.zxl.entity.DeptExample;
import com.zxl.service.DeptService;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

	@Resource
	private DeptMapper deptMapper;
	private DeptExample deptExample;
	
	@Override
	public List<Dept> selectDept() throws Exception {
		return deptMapper.selectByExample(deptExample);
	}

}
