package com.cristian.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cristian.backend.apirest.models.entity.Registro;

public interface IRegisterDao extends CrudRepository<Registro, Long> {

}
