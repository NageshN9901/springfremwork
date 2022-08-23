package com.nagesh.Beyours;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {// here we are creating spring container  
    	// rhs = interface and lhs=clas of that interface
    ApplicationContext context =new ClassPathXmlApplicationContext("NewFile.xml");
    	//Vechicle obj=(Vechicle)context.getBean("vechicle");//NewFile.Xml is wher we defined our beans
    	// now below when use annations
//    Vechicle obj1=(Vechicle)context.getBean("bike");
//   Vechicle obj=(Vechicle)context.getBean("car");// now need it shou;d be decaptilonly passing object
//  
  	Car obj =(Car)context.getBean("car");
  	obj.drive();
//    	obj.drive();
//    	obj1.drive();
    	// here geTBean is method in Beanfaciory and appilctinceionetxt
    	
      //Car car=new Car();
      //car.drive();
    	//Vechicle vechicle=new Vechicle() {
		//	
			//public void drive() {
			//	// TODO Auto-generated method stub
				
			//}
		//};
  // ere everyrtime we need chnage object so evry time source ciode ned change we use sprin now 
    //now need to create tyre object
    //Tyre tyer=new Tyre(); new keyword uses soem depencdes
//    Tyre t=(Tyre)context.getBean("tyre");// need to add depnchyes in xml file
//    System.out.println(t);
    }
}
