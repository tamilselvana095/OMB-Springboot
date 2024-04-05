package com.omb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omb.dto.MaidLoginDto;
import com.omb.entity.MaidEntity;
import com.omb.service.MaidService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/maid")
public class MaidController {
	
	@Autowired
	private MaidService maidService;
	
	@PostMapping("/register")
	public String registerMaid(@RequestBody MaidEntity maidEntity) {return maidService.registerMaid(maidEntity);}
	
	@PostMapping("/login")
	public String loginMaid(@RequestBody MaidLoginDto maidLoginDto) {return maidService.loginMaid(maidLoginDto);}
		
	

}
