package com.zxl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxl.dao.UsersMapper;
import com.zxl.entity.Users;
import com.zxl.entity.UsersExample;
import com.zxl.service.UsersService;

@Service @Transactional
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersMapper uMapper;
	private UsersExample uExample;
	@Override
	public List<Users> findAll() throws Exception {
		List<Users> uList= uMapper.selectByExample(uExample);
		return uList;
	}

}
