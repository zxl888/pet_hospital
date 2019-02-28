package com.zxl.service;

import java.util.List;
import java.util.Map;

public interface SchedulesService {
	public List<Map<String, Object>> selectSchDoc(String deptId, String docId) throws Exception; 
}
