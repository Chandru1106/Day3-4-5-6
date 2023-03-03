package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.project.demo.demo;
import com.example.project.repository.repository;

@Service
public class service {
	
	@Autowired(required=true)
	repository prepo;
	
	public demo saveDetails(demo e)
	{
		
	return prepo.save(e);
	}
    public List<demo> getDetails()
    {
    	return prepo.findAll();
    }
    public demo updateDetails(demo s)
    {
    	return prepo.saveAndFlush(s);
    }
    public void deleteDetails1(int aid)
    {
    	prepo.deleteById(aid);
    }

	public List<demo> getSorted(String field) {
		return prepo.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<demo> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
		Page<demo> page =prepo.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
	public List <demo> getDetails(int s,String b){
		return prepo.getStudentInfo(s, b);
	}
	
	public Integer deleteDetails(int s){
		return prepo.deleteStudentInfo(s);
	}
	
	public Integer updateDetails(int s,int s1){
		return prepo.updateStudentInfo(s,s1);
	}

}
