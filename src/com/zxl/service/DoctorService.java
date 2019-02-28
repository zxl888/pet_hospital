package com.zxl.service;

import java.util.List;

import com.zxl.entity.Doctors;

public interface DoctorService {
	public List<Doctors> selectDoctor() throws Exception;
	
	public List<Doctors> doctorFindByDeptid(String deptid) throws Exception;

}
