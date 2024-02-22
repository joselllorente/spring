package spring.ejercicios.logs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainCalculadora {
	 public static void main( String[] args )
	    {
		 ApplicationContext context = new ClassPathXmlApplicationContext("calculadora.xml");
		 Calculadora calculadora = (Calculadora)context.getBean("Calculadora");
		 LogGetafe log = (LogGetafe)context.getBean("LogGetafe");
		 //calculadora.sumar();
		 
		 //LogGetafe log = calculadora.getLog();
		 System.out.println("fuera de bucle nivelLog = "+ (log.getNivelLog()));
		 for (int i = 0; i<=5; i++) {
			 log.setNivelLog(i);
			 //System.out.println("bucle nivelLog = "+ (log.getNivelLog()));
			 calculadora.sumar();
			 System.out.println("----------------");
//			 calculadora.sumar(3,5);
//			 System.out.println("----------------");
		 }
	    }
}
