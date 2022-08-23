package com.nagesh.Beyours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vechicle {
	// need to create object 
	@Autowired
	private Tyre tyre;// this is object of tyre
	// get ans set
	
public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

public void drive() {
	System.out.println("car ready");
	System.out.println("car  ready to take" + tyre);// wnen ever we call this method it will call tyre class toString method
	
}
}
