package com.zxl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zxl.dao.AppointmentsMapper;
import com.zxl.entity.Appointments;
import com.zxl.service.appointmentsService;

@Service
@Transactional
public class appointmentServiceImpl implements appointmentsService {
	
	@Resource
	private AppointmentsMapper appMapper;

	@Override
	public String appointment(Appointments app) throws Exception {
		System.out.println("*****************");
		System.out.println(app);
		int retValue = appMapper.insertSelective(app);
		if(retValue==1) {
			return "succeed";
		}
		return "succeed";
	}

}
