package spring.ejercicios.herenciaprensa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanHerenciaPrensa.xml");
		
		Persona persona1 = (Persona)context.getBean("persona1");
		System.out.println(persona1);
		
		Persona persona2 = (Persona)context.getBean("persona2");
		System.out.println(persona2);

		
		persona1.iniciarLectura();
		persona2.iniciarLectura();
	}

}
