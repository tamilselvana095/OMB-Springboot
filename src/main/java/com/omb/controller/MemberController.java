package com.omb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omb.entity.MemberEntity;
import com.omb.service.MemberService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@PostMapping("/register")
	public String registerMember(@RequestBody MemberEntity memberEntity) {return memberService.registerMember(memberEntity);}
	
	@GetMapping("/jobs")
	public List<MemberEntity>listOfJobs(){return memberService.listOfJobs();}

}
