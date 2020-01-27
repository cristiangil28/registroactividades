package com.cristian.backend.apirest.controllers;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.backend.apirest.models.entity.Registro;
import com.cristian.backend.apirest.models.service.IRegisterService;

@RestController
public class RegisterController {
	
	@Autowired
	private IRegisterService registerService;
	
	@GetMapping("/listarregistros")
	
	public List<Registro> getAllRegister(){
		return registerService.findAll();
	}
	
	 @PostMapping("/register")
	 public Registro createRegister(@Valid @RequestBody Registro registro) {
	     return registerService.createRegister(registro);
	 }

}
