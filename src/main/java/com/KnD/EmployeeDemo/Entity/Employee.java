package com.KnD.EmployeeDemo.Entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.TABLE)
	private int id;
	private String _name;
	private String _mobileNumber;
	private String _department;
	private String _designation;
	private ArrayList <String> skills;
	private String skill;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return _name;
	}
	public void setName(String name) {
		this._name = name;
	}
	public String getMobile_no() {
		return _mobileNumber;
	}
	public void setMobile_no(String mobile_no) {
		this._mobileNumber = mobile_no;
	}
	public String getDepartment() {
		return _department;
	}
	public void setDepartment(String department) {
		this._department = department;
	}
	public String getDesignation() {
		return _designation;
	}
	public void setDesignation(String designation) {
		this._designation = designation;
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
		return "Employee [id=" + id + ", name=" + _name + ", mobile_no=" + _mobileNumber + ", department=" + _department
				+ ", designation=" + _designation + ", skill=" + skill + "]";
	}
}
