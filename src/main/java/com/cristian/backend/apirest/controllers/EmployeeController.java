package com.cristian.backend.apirest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.backend.apirest.models.entity.Empleado;
import com.cristian.backend.apirest.models.service.IEmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/listar")
	public List<Empleado> getAllEmployees(){
		return employeeService.findAll();
	}
	
	 @PostMapping("/empleado")
	 public Empleado createEmployee(@Valid @RequestBody Empleado empleado) {
	     return employeeService.createEmployee(empleado);
	 }
}
