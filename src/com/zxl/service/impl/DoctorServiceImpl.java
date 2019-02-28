package com.zxl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxl.dao.DoctorsMapper;
import com.zxl.entity.Doctors;
import com.zxl.entity.DoctorsExample;
import com.zxl.service.DoctorService;

@Service
@Transactional
public class DoctorServiceImpl implements DoctorService {

	@Resource
	private DoctorsMapper doctorsMapper;
	private DoctorsExample doctorsExample;
	
	@Override
	public List<Doctors> selectDoctor() throws Exception {
		return doctorsMapper.selectByExample(doctorsExample);
	}

	@Override
	public List<Doctors> doctorFindByDeptid(String deptid) throws Exception {
		return doctorsMapper.doctorFindByDeptid(deptid);
	}

}
