package spring.ejercicios.tienda.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ejercicios.tienda.beans.Pantalon;

public class TiendaMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansTienda.xml");

		Pantalon pantalon = (Pantalon)context.getBean("pantalon2");
		
		System.out.println(pantalon);
		//System.out.println(pantalon.getBoton());
		
		System.out.println("Fin");
	}

}
