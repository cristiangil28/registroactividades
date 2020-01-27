package com.cristian.backend.apirest.models.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cristian.backend.apirest.models.dao.IRegisterDao;
import com.cristian.backend.apirest.models.entity.Registro;

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
	public Registro createRegister(Registro registro) {
		// TODO Auto-generated method stub
			return registerDao.save(registro);
	}

}
