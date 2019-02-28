package com.zxl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxl.entity.Doctors;
import com.zxl.service.DoctorService;

import net.sf.json.JSONArray;

@Controller
public class DoctorController {

	@Autowired
	private DoctorService DoctorService;
	
	@RequestMapping(value = "doctorFindByDeptid/{deptid}", produces = { "text/html;charset=utf-8" })
	public @ResponseBody String doctorFindByDeptid(@PathVariable("deptid") String deptid) throws Exception {
		List<Doctors> dlist = DoctorService.doctorFindByDeptid(deptid);
		JSONArray jsonArray = JSONArray.fromObject(dlist);
		System.out.println(jsonArray.toString());
		return jsonArray.toString();
		
	}
	
}
