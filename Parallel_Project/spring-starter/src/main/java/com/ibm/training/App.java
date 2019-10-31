package com.ibm.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       
    	//Load the application context
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
    	
    	//Get a reference to the Engineer object
//    	Engineer eng =  context.getBean("myEngineer", Engineer.class);
//
//       
//    	//Call the method on bean
//    	eng.workForWages();
    	
    	
//    	SoftwareEngineer eng = context.getBean("softwareEngineer", SoftwareEngineer.class);
//   
    	//eng.workForWages();
    	
    	//NetworkEngineer eng = context.getBean("aliasEngineer", NetworkEngineer.class);
    	
//    	eng.workForWages();
    	
    	
//    	NetworkEngineer eng2 = context.getBean("aliasEngineer", NetworkEngineer.class);
//    	
//    	System.out.println(eng + ", " + eng2);
    	
//    	CivilEngineer eng = context.getBean("civilEng", CivilEngineer.class);
//    	
//    	eng.workForWages();
    	
    	Engineer eng = context.getBean("anEngineer", AnnotationEngineer.class);
    	
    	eng.workForWages();
    	
    }
}
