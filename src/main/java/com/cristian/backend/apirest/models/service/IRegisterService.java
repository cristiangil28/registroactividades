package com.cristian.backend.apirest.models.service;

import java.util.List;


import com.cristian.backend.apirest.models.entity.Registro;

public interface IRegisterService {
	public List<Registro> findAll();
	public Registro createRegister(Registro registro);
}
