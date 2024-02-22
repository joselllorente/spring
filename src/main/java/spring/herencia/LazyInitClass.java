package spring.herencia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitClass {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("LazyInit.xml");
		
		System.out.println("Llamando a LazyInit");
		
//		Element objA=(Element)context.getBean("lazyInit2");
//		objA.getNombre();
	}

}
