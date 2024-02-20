package spring.inyecciondependencias.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.inyecciondependencias.pojos.Usuario;

public class IDOrdenConstructor {

	public static void main(String args[]){
		
	
		ApplicationContext context=new ClassPathXmlApplicationContext("OrderBeans.xml");
		
		Usuario usu=(Usuario)context.getBean("usuario");
		System.out.println(usu);
	}
	
}
