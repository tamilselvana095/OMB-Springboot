package com.omb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.omb.entity.MaidEntity;

@Repository
public interface MaidRepo extends JpaRepository<MaidEntity, Integer> {

	@Query(value = "select * from maid_entity m where m.phone=:phone and m.password=:password", nativeQuery = true)
	MaidEntity findUser(String phone, String password);

}
