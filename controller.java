package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.demo.demo;
import com.example.project.service.service;

@RestController
public class controller {
	@Autowired
	service eser;
	@PostMapping("/addDet12")
	
	public demo addDetails(@RequestBody  demo e)
	{
		return eser.saveDetails(e);
	}
	
	@GetMapping("/showdet1")
	public List<demo> fetchDetails()
	{
		return eser.getDetails();
	}
    @PutMapping("/updatedet1")
    public demo updateInfo(@RequestBody demo s)
    {
    	return eser.updateDetails(s);
    }
    @DeleteMapping("/deletedet1/{aid}")
    public String deleteInfo1(@PathVariable("aid") int aid)
    {
    	eser.deleteDetails1(aid);
    	return "Details Deleted Successfully";
    }
    
  //sorting
  		@GetMapping("/details1/{field}")
  		public List<demo> getWithSort(@PathVariable String field) {
  			return eser.getSorted(field);
  		}

  		// pagination
  		@GetMapping("/details1/{offset}/{pageSize}")
  		public List<demo> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
  			return eser.getWithPagination(offset, pageSize);
  		}
  		@GetMapping("/getnew/{aid}/{aname}")
  		public List <demo> displayAll(@PathVariable("aid") int s,@PathVariable("aname") String b){
  			return eser.getDetails(s,b);
  		}
  		
  		@DeleteMapping("/deletenew/{aid}")
  		public String deleteInfo(@PathVariable("aid") int s){
  			eser.deleteDetails(s);
  			return "Deleted";
  		}
  		
  		@PutMapping("/update/{aid}/{aid1}")
  		public String updateInfo(@PathVariable("aid") int s,@PathVariable("aid1") int s1){
  			 eser.updateDetails(s,s1);
  			 return "Updated";
  		}
}
