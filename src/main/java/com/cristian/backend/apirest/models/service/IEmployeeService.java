package com.cristian.backend.apirest.models.service;

import java.util.List;

import com.cristian.backend.apirest.models.entity.Empleado;

public interface IEmployeeService {
	public List<Empleado> findAll();
	public Empleado createEmployee(Empleado empleado);

}
