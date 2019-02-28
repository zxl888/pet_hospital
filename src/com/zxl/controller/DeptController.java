package com.zxl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxl.entity.Dept;
import com.zxl.service.DeptService;

import net.sf.json.JSONArray;

@Controller
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@RequestMapping(value = "selectDept", produces = { "text/html;charset=utf-8" })
	public @ResponseBody String selectDept() throws Exception {
		List<Dept> dlist = deptService.selectDept();
		JSONArray jsonArray = JSONArray.fromObject(dlist);
		System.out.println(jsonArray.toString());
		return jsonArray.toString();
		
	}
}
