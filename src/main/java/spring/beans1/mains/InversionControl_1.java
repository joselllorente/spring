package spring.beans1.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans1.beans.HelloWorld;

public class InversionControl_1 {

	public static void main(String args[]){
		//Crea una factoria/contexto que utiliza archivo xml para crearse.
		//Instancia los componentes de la aplicacion, dependiendo de necesidades del proyecto 
		//solo sería necesario cambiar el xml
		
		
		//Carga fichero de configuracion
		//Resource recurso = new FileSystemResource("Beans.xml");
		//ClassPathResource recurso = new ClassPathResource("com/curso/Beans.xml");
		//FileSystemResource recurso = new FileSystemResource("/ruta/directorio/Beans.xml");
		
		//BeanFactory Es la clase base sobre la que se asienta la inversion de control, es el interfaz báscio
		//BeanFactory context =  new XmlBeanFactory(recurso);
		
		//Cargar fichero de configuragion del cllaspath
		//BeanFactory context =  new ClassPathXmlApplicationContext("Beans.xml");
		
		//Cargar varios ficheros de configuracion
		//BeanFactory context =  new ClassPathXmlApplicationContext(new String [] {"Beans_servicios.xml","Beans_dao.xml"});
		
		
		//ApplicationContext es una factoria avanzada que hereda de BeanFactory pero que la amplia con bastante informacion
		//Asi como permitir integracion con frameworks de persistencia como hibernate o JPA o Web como Struts,JSF o SpringMVC
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		
		
		
	}
}
