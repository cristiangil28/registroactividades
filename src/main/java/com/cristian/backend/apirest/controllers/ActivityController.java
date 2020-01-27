package com.cristian.backend.apirest.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cristian.backend.apirest.models.entity.Activity;
import com.cristian.backend.apirest.models.service.IActivityService;

@RestController
public class ActivityController {
	
	@Autowired
	private IActivityService activityService;
	
	@GetMapping("/listaractividades")
	public List<Activity> getAllEmployees(){
		return activityService.findAll();
	}
	
	 @PostMapping("/actividad")
	 public Activity createActivity(@Valid @RequestBody Activity activity) {
	     return activityService.createActivity(activity);
	 }

}
