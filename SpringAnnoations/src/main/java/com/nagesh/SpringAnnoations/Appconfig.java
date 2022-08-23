package com.nagesh.SpringAnnoations;

import java.beans.JavaBean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/// measn this class is job is to amke confiagrtion 
@ComponentScan(basePackages = "com.nagesh.SpringAnnoations")
public class Appconfig {
  // here without below code we are going to do by b anntotion compenent aiuotwireing
	// below is one way
//	@Bean
//
//	public Samsang getPhone() {
//		return new Samsang();
//	}
//	@Bean
//	public Mobileprocesser getProccser() {
//		return new  SnapDrgaon();
//	}
}
