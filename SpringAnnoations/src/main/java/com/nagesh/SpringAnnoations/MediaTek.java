package com.nagesh.SpringAnnoations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


// here we have two class impleted one interface call Mobileprocesser so compler will get  confiuse error
@Component
// to select by compler we need mention
@Primary // or we can do with @Qulifaier above the object we can finf in samsang class


public class MediaTek implements Mobileprocesser {

	public void process() {
		System.out.println("2nd best cpu iam media tek");

	}

}
