package com.zxl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxl.dao.PetsMapper;
import com.zxl.entity.Pets;
import com.zxl.service.PetsService;

@Service
@Transactional
public class PetsServiceImpl implements PetsService{
	@Resource
	private PetsMapper pMapper;
	private Pets pets;

	@Override
	public Pets findById(int pid) throws Exception {
		return pMapper.selectByPrimaryKey(pid);	
	}

}
