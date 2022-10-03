package com.KnD.EmployeeDemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.KnD.EmployeeDemo.Entity.Employee;
import com.KnD.EmployeeDemo.Service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public String formPage() {
		System.out.println("/");
		return "index.jsp";
	}
	
	@GetMapping("/register")
	public String showForm(Model model) {
		Employee emp = new Employee();
		model.addAttribute("emp",emp);
		System.out.println("GET /register");
		return "register.jsp";
	}
	
	
//	WEB
//	@PostMapping("/register")
//	@ResponseBody
//	public void submitForm(@ModelAttribute("emp") Employee emp) {
//		System.out.println("POST /register");
//		System.out.println(emp.toString());
//		service.insertEmployee(emp);
//	}
	
	
//	POSTMAN
	@PostMapping("/register")
	@ResponseBody
	public String submitForm(@RequestBody Employee emp) {
		System.out.println("POST /register");
		System.out.println(emp.toString());
		return emp.toString();
	}
}