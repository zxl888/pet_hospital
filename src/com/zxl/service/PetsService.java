package com.zxl.service;

import org.springframework.stereotype.Service;

import com.zxl.entity.Pets;

public interface PetsService {
	public Pets findById(int pid) throws Exception; 

}
