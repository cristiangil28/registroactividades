package com.cristian.backend.apirest.models.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cristian.backend.apirest.models.dao.IRegisterDao;
import com.cristian.backend.apirest.models.entity.Empleado;
import com.cristian.backend.apirest.models.entity.Registro;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class RegisterServiceImpl implements IRegisterService{
	
	@Autowired
	private IRegisterDao registerDao;

	@Override
	@Transactional(readOnly = true)
	public List<Registro> findAll() {
		// TODO Auto-generated method stub
		return (List<Registro>) registerDao.findAll();
	}

	@Override
	@Transactional
	public String createRegister(Registro registro) {
		// TODO Auto-generated method stub
		
		String mensaje ="";
		if(registerDao.save(registro) !=null) {
			
			mensaje="registro guardado existosamente";
		}
		else {
			mensaje = new RuntimeException("el empleado no fue guardado").getMessage();
		}
		return mensaje;
	}
	@Override
	public Registro findById(Long id) {
		// TODO Auto-generated method stub
		return registerDao.findById(id).get();
	}

}
