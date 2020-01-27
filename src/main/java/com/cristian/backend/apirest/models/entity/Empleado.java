package com.cristian.backend.apirest.models.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="empleados")
public class Empleado{
	/**
	 * 
	 */
	
	@OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Activity> actividades;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long empleado_id;
	@NotNull
	private String nombre;
	@NotNull
	private String apellidos;
	@NotNull
	private String email;

	public Long getId() {
		return empleado_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
