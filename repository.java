package com.example.project.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.project.demo.demo;

import jakarta.transaction.Transactional;
@Repository

public interface repository extends JpaRepository<demo,Integer>{

	@Query(value="select * from data where aid=:s or aname=:sn",nativeQuery=true)
	public List<demo>getStudentInfo(@Param("s") int aid,@Param("sn") String aname);

	@Modifying
	@Transactional
	@Query(value="delete from data where aid=:s",nativeQuery=true)
	public Integer deleteStudentInfo(@Param("s") int aid);
	
	@Modifying
	@Transactional
	@Query(value="update data m set m.aid =:s where m.aid=:s1",nativeQuery=true)
	public Integer updateStudentInfo(@Param("s") int aid,@Param("s1") int newid);

}

