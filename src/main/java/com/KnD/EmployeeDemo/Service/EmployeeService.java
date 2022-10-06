package com.KnD.EmployeeDemo.Service;

import java.util.Objects;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KnD.EmployeeDemo.Entity.Employee;
import com.KnD.EmployeeDemo.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Transactional
	public void insertEmployee(Employee emp) {
		repo.save(emp);		
	}
	
	public Employee findEmployee(Employee emp, int id) {
		Employee employee = repo.findById(id).get();
		return repo.save(employee);
	}
	
	public Iterable<Employee> displayAllEmployee() {
		return repo.findAll();
	}
	
	public Employee updateEmployee(Employee emp, int id) {
		Employee e = repo.findById(id).get();
		
		if(Objects.nonNull(emp.getName()) && !"".equalsIgnoreCase(emp.getName())) {
			emp.setName(e.getName());
		}
		
		if(Objects.nonNull(emp.getMobile_no()) && !"".equalsIgnoreCase(emp.getMobile_no())) {
			emp.setMobile_no(e.getMobile_no());
		}
		
		if(Objects.nonNull(emp.getDesignation()) && !"".equalsIgnoreCase(emp.getDesignation())) {
			emp.setDesignation(e.getDesignation());
		}
		
		if(Objects.nonNull(emp.getDepartment()) && !"".equalsIgnoreCase(emp.getDepartment())) {
			emp.setDepartment(e.getDepartment());
		}
		
		if(Objects.nonNull(emp.getSkills()) && !"".equalsIgnoreCase(emp.getSkill())) {
			emp.setSkills(e.getSkills());
		}
		
		return repo.save(emp);
	}
	
	public void deleteEmployee() {
		
	}
}
