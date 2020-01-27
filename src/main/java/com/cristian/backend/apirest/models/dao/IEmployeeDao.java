package com.cristian.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.cristian.backend.apirest.models.entity.Empleado;

@Repository
public interface IEmployeeDao extends PagingAndSortingRepository<Empleado, Long>{

}
