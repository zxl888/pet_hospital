package com.zxl.service;

import java.util.List;
import java.util.Map;

import com.zxl.entity.Bills;
import com.zxl.entity.Pets;

public interface BillsService {
	public Bills billFindById(Bills bills) throws Exception;
	
	public int countByBillId(Pets pets)throws Exception;
	
	public List<Map<String, Object>> selectByPOIdCard(Pets pets)throws Exception;
	
	public Map<String,Object> selectByBillId(int billId)throws Exception;
}
