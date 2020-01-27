package com.cristian.backend.apirest.models.service;

import java.util.List;

import com.cristian.backend.apirest.models.entity.Activity;

public interface IActivityService  {
	public List<Activity> findAll();
	public Activity createActivity(Activity activity);

}
