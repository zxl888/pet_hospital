package com.zxl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxl.dao.BillsMapper;
import com.zxl.entity.Bills;
import com.zxl.entity.BillsExample;
import com.zxl.entity.Pets;
import com.zxl.service.BillsService;

@Service
@Transactional
public class BillsServiceImpl implements BillsService {

	@Resource
	private BillsMapper billsMapper;

	@Override
	public Bills billFindById(Bills bills) throws Exception {
		return billsMapper.selectByPrimaryKey(bills.getBillid());
	}

	@Override
	public int countByBillId(Pets pets) throws Exception {
		return billsMapper.countByPId(pets);
	}

	@Override
	public List<Map<String, Object>> selectByPOIdCard(Pets pets) throws Exception {
		return billsMapper.selectByPOIdCard(pets);
	}

	@Override
	public Map<String, Object> selectByBillId(int billId) throws Exception {
		return billsMapper.selectByBillId(billId);
	}

}
