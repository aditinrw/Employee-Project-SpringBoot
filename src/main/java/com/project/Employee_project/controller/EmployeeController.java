package com.project.Employee_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Employee_project.entity.Employee;
import com.project.Employee_project.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/showallEmployee ")
	public List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/status/{status}")
	public List<Employee> getEmployeeByStatus(@PathVariable String status) {
		return employeeService.getEmployeeByStatus(status);
	}
	
	@GetMapping("/{id}")
	public List<Employee> getEmployeeById(@PathVariable int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/showEmployeesByName/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name) {
		return employeeService.getEmployeeByName(name);
	}
	
	@PostMapping("/addemployee")
	public String addEmployee(@RequestBody Employee emp) {
	    return employeeService.addEmployee(emp);
	}
	
	@PutMapping("/updatecountryname/{cid}")
	public String updateEmployeeCountry(@RequestBody String country, @PathVariable int cid) {
		return employeeService.updateEmployeeCountry(country, cid);
	}
	
	@DeleteMapping("/deletebycountryname/{country}")
	public String delteEmployeeByCountry(@PathVariable String country) {
		return employeeService.delteEmployeeByCountry(country);
	}
	
	@DeleteMapping("/deleteemployeebyid/{id}")
	public String delteEmployeeById(@PathVariable int id) {
		return employeeService.delteEmployeeById(id);
	}

}
