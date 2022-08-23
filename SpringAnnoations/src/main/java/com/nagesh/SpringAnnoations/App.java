package com.nagesh.SpringAnnoations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// below we use how create object withour usung normal new  keyword with help of depndency using applictionconetxt
    	ApplicationContext factory=new AnnotationConfigApplicationContext(Appconfig.class);
       Samsang s7=factory.getBean(Samsang.class);// so we want samsang class objecyt
       s7.config();
//       Octa core, 4 gb 123 mp camera
//       worlds best cpuu
}}
