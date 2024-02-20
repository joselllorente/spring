package spring.inyecciondependencias.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.inyecciondependencias.pojos.TextEditor;

public class InyeccionDependencias {

	public static void main(String args[]){
		
		//Inyeccion por propiedades. Se pasa el parametro llamando al metodo set del objeto
		//ApplicationContext context=new ClassPathXmlApplicationContext("IoDSetBeans.xml");
		
		//Inyeccion por constructor. Se pasa al constructor el parametros con el mismo numero de parametros y en el mismo orden
		ApplicationContext context=new ClassPathXmlApplicationContext("IoDConsBeans.xml");
		
		//Indicamos el orden en que llegan los parametros al contructor
		//ApplicationContext context=new ClassPathXmlApplicationContext("OrderBeans.xml");
		
		TextEditor te=(TextEditor)context.getBean("textEditor");
		te.spellCheck();
	}
}
