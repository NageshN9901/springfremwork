package com.nagesh.Beyours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component// when ever  we give componenet it will sesrched by autowireding anntition
public class Tyre {
	// varibel

private String brand;
// with construter we can do constret injection 
//public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

//geters and setetrds
public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}
// tostring for to print data
@Override
//public String toString() {
//	return "Tyre [brand=" + brand + "]";
public String toString() {
	return "iam car class to take tyre";
}
 
}
