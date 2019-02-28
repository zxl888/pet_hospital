package com.zxl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxl.entity.Appointments;
import com.zxl.service.appointmentsService;

@Controller
public class AppointmentController {
	@Autowired
	private appointmentsService appService;

	//跳转到预约界面
	@RequestMapping("appointmentView")
	public String appointmentView() {
		return "appointment";	
	}
	
	//预约
	@RequestMapping(value="appointment", produces = { "text/html;charset=utf-8" })
	public @ResponseBody String appointment(Appointments appointments) throws Exception {
		return appService.appointment(appointments);
	}
}
