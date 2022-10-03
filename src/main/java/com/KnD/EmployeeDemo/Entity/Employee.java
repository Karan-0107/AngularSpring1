package com.KnD.EmployeeDemo.Entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
//	private Convert convert;
	
	@Id
//	@GeneratedValue
	private String id;
	private String name;
	private String mobile_no;
	private String department;
	private String designation;
	private ArrayList <String> skills;
	private String skill;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<String> skills) {
		this.skills = skills;
		this.skill = String.join(",",skills);
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile_no=" + mobile_no + ", department=" + department
				+ ", designation=" + designation + ", skill=" + skill + "]";
	}
}
