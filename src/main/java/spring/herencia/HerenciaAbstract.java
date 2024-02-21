package spring.herencia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HerenciaAbstract {

	public static void main(String args[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("AlternateBeans.xml");
		
		//No se puede crear objeto ya que es abstract
		HelloWorld objA=(HelloWorld)context.getBean("beanTemplate");
		objA.getMessage1();
		objA.getMessage2();
		
		//Aunque no tenga mensaje 2 hereda el del padre
		NamasteIndia objB=(NamasteIndia)context.getBean("namasteIndia");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
	}
}
