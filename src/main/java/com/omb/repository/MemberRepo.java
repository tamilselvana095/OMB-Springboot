package com.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omb.entity.MemberEntity;

@Repository
public interface MemberRepo extends JpaRepository<MemberEntity, Integer> {

}
