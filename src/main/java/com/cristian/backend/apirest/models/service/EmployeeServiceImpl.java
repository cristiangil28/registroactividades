package com.cristian.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cristian.backend.apirest.models.dao.IEmployeeDao;
import com.cristian.backend.apirest.models.entity.Empleado;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDao employeeDao;

	@Override
	@Transactional(readOnly=true)
	public List<Empleado> findAll() {
		// TODO Auto-generated method stub
		return (List<Empleado>) employeeDao.findAll();
	}

	@Override
	@Transactional
	public Empleado createEmployee(Empleado empleado) {
		// TODO Auto-generated method stub
		return employeeDao.save(empleado);
	}

	@Override
	public Empleado findById(Long id) {
		// TODO Auto-generated method stub
		return employeeDao.findById(id).get();
	}

	@Override
	public Page<Empleado> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return employeeDao.findAll(pageable);
	}

}
