package com.zxl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxl.dao.BreedsMapper;
import com.zxl.entity.Breeds;
import com.zxl.entity.BreedsExample;
import com.zxl.service.BreedsService;

@Service
@Transactional
public class BreedsServiceImpl implements BreedsService {
	@Resource
	private BreedsMapper breedsMapper;
	private BreedsExample breedsExample;
	
	@Override
	public List<Breeds> selectBreeds() throws Exception {
		List<Breeds> blist = breedsMapper.selectByExample(breedsExample);
		return blist;
	}

}
