package com.example.project.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="data")
public class demo {
	@Id
	@Column(name="aid")
	private int aid;
	@Column(name="aname")
	private String aname;
	@Column(name="acount")
	private int acount;
	@Column(name="adistrict")
	private String adistrict;


	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getAcount() {
		return acount;
	}

	public void setAcount(int acount) {
		this.acount = acount;
	}

	public String getAdistrict() {
		return adistrict;
	}

	public void setAdistrict(String adistrict) {
		this.adistrict = adistrict;
	}

	public demo(int aid, String aname, int acount, String adistrict) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.acount = acount;
		this.adistrict = adistrict;
	}
	public String toString() {
		return "aid="+aid+"aname="+aname+"acount="+acount+"adistrict="+adistrict;
	}
	public demo(){
		
	}
}
