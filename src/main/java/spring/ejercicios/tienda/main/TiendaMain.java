package spring.ejercicios.tienda.main;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.ejercicios.tienda.beans.Maniqui;
import spring.ejercicios.tienda.beans.Tienda;

public class TiendaMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansTienda.xml");

		//Pantalon pantalon = (Pantalon)context.getBean("pantalon2");
		
		//System.out.println(pantalon);
		//System.out.println(pantalon.getBoton());
		
//		Camisa camisa = (Camisa)context.getBean("camisa");
//		for(Boton boton : camisa.getBotones()) {
//			System.out.println(boton.getId());
//		}
//		System.out.println(camisa);
//		System.out.println("Fin");
		
		Tienda tienda = (Tienda)context.getBean("tienda");
		System.out.println("Nombre: "+tienda.getNombre());
		Map<String,Maniqui> maniquis = tienda.getManiquies();
		
		for (Maniqui maniqui:maniquis.values()) {
			System.out.println(maniqui);
		}
		
	}

}





