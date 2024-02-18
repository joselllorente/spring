package spring.beans1.mains;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CicloVida {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Activar InitHelloWorld en el Beans.xml
		AbstractApplicationContext context=new 
				ClassPathXmlApplicationContext("BeansCicloVida.xml");
		
//		System.out.println("Iniciando Helloworld2");
//		HelloWorld2 obj=(HelloWorld2)context.getBean("helloWorld4");
//		obj.getMessage();
		//Registra cuando el bean será destruido
		System.out.println("\r\rDestruyendo contexto");
		context.registerShutdownHook();
	}

}
