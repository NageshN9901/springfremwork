package com.nagesh.SpringAnnoations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component("samsung")
//or
 @Component //when we are not provding any id to to annaotion it will take id as Non qulifeidd and decaptileed class name
 
public class Samsang {
	@Autowired// when i give this annotoation it will check same retrun type mthod 
	// here we can mention our wishfull cpu to taken by compler
	@Qualifier("mediaTek")// we need mention the class name is decaoptilin firstwordss
	Mobileprocesser cpu;
	
public Mobileprocesser getCpu() {
		return cpu;
	}

	public void setCpu(Mobileprocesser cpu) {
		this.cpu = cpu;
	}

public void config() {
	System.out.println("Octa core, 4 gb 123 mp camera");
	cpu.process();// here there is no object so it we need create Bean in Appconig
}
}
