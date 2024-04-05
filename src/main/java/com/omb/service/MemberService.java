package com.omb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omb.entity.MemberEntity;
import com.omb.repository.MemberRepo;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepo memberRepo;

	public String registerMember(MemberEntity memberEntity) {
		memberRepo.save(memberEntity);
		return "success";
	}

	public List<MemberEntity> listOfJobs() {
		
		return memberRepo.findAll();
	}

}
