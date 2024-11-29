package com.project.Employee_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Employee_project.dao.EmployeeRepository;
import com.project.Employee_project.entity.Employee;


@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee() {
		return employeeRepository.getAllEmpoyee();
	}
	
	public List<Employee> getEmployeeByStatus(String status) {
		return employeeRepository.getEmployeeByStatus(status);
	}
	
	public List<Employee> getEmployeeById(int id) {
		return employeeRepository.getEmployeeById(id);
	}
	
	public List<Employee> getEmployeeByName(String name) {
		return employeeRepository.getEmployeeByName(name);
	}
	
	public String addEmployee(Employee emp) {
		return employeeRepository.addEmployee(emp);
	}
	
	public String updateEmployeeCountry(String country,int cid) {
		return employeeRepository.updateEmployeeCountry(country, cid);
	}
	
	public String delteEmployeeByCountry(String country) {
		return employeeRepository.delteEmployeeByCountry(country);
	}
	
	public String delteEmployeeById(int id) {
		return employeeRepository.delteEmployeeById(id);
	}

	
}
