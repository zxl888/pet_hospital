package com.zxl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxl.entity.Breeds;
import com.zxl.service.BreedsService;

import net.sf.json.JSONArray;

@Controller
public class BreedsController {
	@Autowired
	private BreedsService breedsService;
	
	@RequestMapping(value = "selectBreeds", produces = { "text/html;charset=utf-8" })
	public @ResponseBody String selectBreeds() throws Exception {
		List<Breeds> bList = breedsService.selectBreeds();
		JSONArray jsonArray = JSONArray.fromObject(bList);
		return jsonArray.toString();
	}
}
