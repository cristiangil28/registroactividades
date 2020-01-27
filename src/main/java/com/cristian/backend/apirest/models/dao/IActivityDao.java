package com.cristian.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.cristian.backend.apirest.models.entity.Activity;

public interface IActivityDao extends CrudRepository<Activity, Long> {

}
