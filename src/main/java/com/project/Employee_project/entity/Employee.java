package com.project.Employee_project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name; 
	private String phoneno; 
	private String departmentit; 
	private String status;  
	private int cid;
	private String country;
	
	public Employee() {
		
	}
	
	public int getId() {
		return id;
	}
	public String getCountry() {
		return country;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getDepartmentit() {
		return departmentit;
	}
	public void setDepartmentit(String departmentit) {
		this.departmentit = departmentit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phoneno=" + phoneno + ", departmentit=" + departmentit
				+ ", status=" + status + ", cid=" + cid + ", country=" + country + "]";
	}

}
