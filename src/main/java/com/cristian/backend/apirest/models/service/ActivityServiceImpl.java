package com.cristian.backend.apirest.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cristian.backend.apirest.models.dao.IActivityDao;
import com.cristian.backend.apirest.models.entity.Activity;

@Service
public class ActivityServiceImpl implements IActivityService {
	
	@Autowired
	private IActivityDao activityDao;

	@Override
	@Transactional(readOnly=true)
	public List<Activity> findAll() {
		// TODO Auto-generated method stub
		return (List<Activity>) activityDao.findAll();
	}

	@Override
	@Transactional
	public Activity createActivity(Activity activity) {
		// TODO Auto-generated method stub
		return activityDao.save(activity);
	}


}
