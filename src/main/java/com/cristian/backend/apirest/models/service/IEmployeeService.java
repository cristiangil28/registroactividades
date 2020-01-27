package com.cristian.backend.apirest.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cristian.backend.apirest.models.entity.Empleado;

public interface IEmployeeService {
	public List<Empleado> findAll();
	public Page<Empleado> findAll(Pageable pageable);
	public Empleado createEmployee(Empleado empleado);
	public Empleado findById(Long id);
}
