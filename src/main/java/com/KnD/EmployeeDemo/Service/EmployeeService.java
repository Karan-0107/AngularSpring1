package com.KnD.EmployeeDemo.Service;

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
	
	public String displayEmployee() {
		return "Data";
	}
	
	public void updateEmployee() {
		
	}
	
	public void deleteEmployee() {
		
	}
}
