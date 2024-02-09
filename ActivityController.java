package com.example.mavdemo.controller;

import com.example.mavdemo.model.Activity;
import com.example.mavdemo.service.ActivityService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/activity")

public class ActivityController {
    @Autowired
    ActivityService activityService;

    @GetMapping("")
    public List<Activity> list() {
        return activityService.listAllUser();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Activity> get(@PathVariable Integer id) {
        try {
        	Activity activity = userService.getActivity(id);
            return new ResponseEntity<Activity>(activity, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Activity>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/")
    public void add(@RequestBody Activity activity) {
    	activityService.saveActivity(activity);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Activity activity, @PathVariable Integer id) {
        try {
        	Activity existActivity = activityService.getActivity(id);
        	activity.setId(id);
        	activityService.saveActivity(activity);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

    	activityService.deleteActivity(id);
    }
}