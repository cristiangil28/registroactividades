package com.cristian.backend.apirest.controllers;

import java.util.List;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.backend.apirest.models.entity.Registro;
import com.cristian.backend.apirest.models.service.IRegisterService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class RegisterController {
	
	@Autowired
	private IRegisterService registerService;
	
	@GetMapping("/listarregistros")
	
	public List<Registro> getAllRegister(){
		return registerService.findAll();
	}
	
	 @PostMapping("/register")
	 public String createRegister(@Valid @RequestBody Registro registro) {
	     
	      
	      boolean resultado= (registro.getTiempo() <=8)?true: false;
			String mensaje ="";
			if(resultado) {
				 registerService.createRegister(registro);
				mensaje="registro guardado existosamente";
			}
			else {
				mensaje = new RuntimeException("el tiempo no puede ser mayor a 8").getMessage();
			}
			return mensaje;
	 }

}
