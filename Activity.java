package com.example.mavdemo

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name ="activity")

public class Actvitiy{
	
	//part of the table 
	// these are the column names of the activity table 
	private int id;
	private int item_id;
	private int activity_id;
	
	//default constructor
	public Activity(){
		
	}
	
	//constructor w/ imported values 
	public Activity(int id, int item_id, int activity_id) {
		this.id=id;
		this item_id = item_id;
		this activity_id=activity_id;
	}
	
	//part of the imports
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
     }
	
}

//if there's another table create it here  
