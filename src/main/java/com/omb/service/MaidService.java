package com.omb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omb.dto.MaidLoginDto;
import com.omb.entity.MaidEntity;
import com.omb.repository.MaidRepo;
import com.omb.utils.JwtUtils;

@Service
public class MaidService {
	
	@Autowired
	private MaidRepo maidRepo;
	
	@Autowired
	private JwtUtils jwtUtils;

	public String registerMaid(MaidEntity maidEntity) {
		 maidRepo.save(maidEntity);
		 return "Succefully Register";

	}

	public String loginMaid(MaidLoginDto maidLoginDto) {
		MaidEntity maidEntity=maidRepo.findUser(maidLoginDto.getPhone(),maidLoginDto.getPassword());
		System.out.println(maidEntity);
		return jwtUtils.generateToken(maidEntity);
	}
		
		
	

}
