package com.zxl.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxl.entity.Bills;
import com.zxl.entity.Pets;
import com.zxl.service.BillsService;
import com.zxl.tool.DateJsonValueProcessor;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

@Controller
public class BillsController {

	@Autowired
	private BillsService billsService;
 
	//跳转到查询账单搜索框页面
	@RequestMapping("searchBillView")
	public String searchBillView() throws Exception {
		return "bills";
	}
	
	//通过id跳转到详细账单页面
	@RequestMapping("billsFindById/{billid}")
	public String billFindById(Bills bill, Model model) throws Exception {
		Map<String, Object> bMap = billsService.selectByBillId(bill.getBillid());
		model.addAttribute("bList", bMap);
		System.out.println(bMap);
		return "bill";
	}
	
	//通过身份证号查询账单ajax
	@RequestMapping(value = "ajaxSelectByPOIdCard/{poidcard}", produces = { "text/html;charset=utf-8" })
	public @ResponseBody String ajaxSelectByPOIdCard(Pets pets) throws Exception {
		List<Map<String, Object>> bList = billsService.selectByPOIdCard(pets);
	    JsonConfig config = new JsonConfig();  
        config.registerJsonValueProcessor(java.sql.Timestamp.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));  
        config.registerJsonValueProcessor(java.sql.Timestamp.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));  
        JSONArray jsonArray = JSONArray.fromObject(bList, config);
		return jsonArray.toString();
	}
	

}
