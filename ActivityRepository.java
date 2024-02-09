package com.example.mavdemo; 


import com.example.mavdemo.model.Activity;


import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer{
}