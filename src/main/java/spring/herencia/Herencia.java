package spring.herencia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Herencia {

	public static void main(String args[]){
		//BeanFactory context =  new ClassPathXmlApplicationContext("Beans.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansHerencia.xml");
		
		HelloWorld objA=(HelloWorld)context.getBean("helloWorld");
		objA.getMessage1();
		objA.getMessage2();
		
		NamasteIndia objB=(NamasteIndia)context.getBean("namasteIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
	}
}
