package spring.beans1.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans1.beans.HelloWorld;

public class ScopeObjects_2 {

	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		//El objeto se mantiene durante toda la ejecucion, si lo modificas se mantendra la modificacion 
		//Es como tener el scope como singleton (por defecto)
//		HelloWorld objA=(HelloWorld)context.getBean("helloWorld");
//		objA.getMessage();
//		objA.setMessage("I'm object A");
//		objA.getMessage();
//		
//		HelloWorld objB=(HelloWorld)context.getBean("helloWorld");
//		objB.getMessage();
//		objA.getMessage();
		
		System.out.println("==========================================================");
		
		//Si utilizamos scope prototype, el objeto se crea de nuevo cada vez que se "instancia"
		HelloWorld objA1=(HelloWorld)context.getBean("helloWorld3");
		objA1.getMessage();
		objA1.setMessage("I'm object A");
		objA1.getMessage();
		
		//se crea una nueva instancia
		HelloWorld objB1=(HelloWorld)context.getBean("helloWorld3");
		objB1.getMessage();
		objA1.getMessage();
	}
}
