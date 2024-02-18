package spring.beans1.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans1.beans.FactoryMethodUse;

public class FactoryMethodMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanFactoryMethod.xml");
		
		FactoryMethodUse fmUse = context.getBean("facMethod", FactoryMethodUse.class);
		System.out.println(fmUse.getMensaje());
		

	}

}
