package com.example.mavdemo.service;

import com.example.mavdemo.model.Activity;
import com.example.mavdemo.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
@Transactional

public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;
    
    
    public List<Activity> listAllActivity() {
        return activityRepository.findAll();
    }

    public void saveActivity(Activity activity) {
    	activityRepository.save(activity);
    }

    public User getActivity(Integer id) {
        return activityRepository.findById(id).get();
    }

    public void deleteActivity(Integer id) {
    	activityRepository.deleteById(id);
    }
}