package com.KnD.EmployeeDemo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.KnD.EmployeeDemo.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
//	Iterable<Employee> findAll(Employee emp);
	
}
