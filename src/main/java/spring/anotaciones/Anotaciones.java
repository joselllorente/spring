package spring.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Anotaciones {

	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansAnotaciones.xml");
		
		Student student=(Student)context.getBean("student");
		System.out.println("Name: "+student.getName());
		System.out.println("Age: "+student.getAge());
		
		Student2 student2=(Student2)context.getBean("student2");
		System.out.println("Name: "+student2.getName());
		System.out.println("Age: "+student2.getAge());
	}
}
