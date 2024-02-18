package spring.beans1.beans;

import java.io.Serializable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloWorld2 implements Serializable, BeanPostProcessor{

	private String message;
	
	public HelloWorld2(){
		
	}

	public String getMessage() {
		System.out.println("Your message: "+message);
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("===============6. HelloWorld2 postProcessBeforeInitialization"+beanName);
		System.out.println("HelloWorld2 FIN postProcessBeforeInitialization\r");
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//Se puede determinar por el tipo (instanceOf) puedo hacer una cosa u otra
		System.out.println("===============9. HelloWorld2 postProcessAfterInitialization"+beanName);
		System.out.println("HelloWorld2 FIN postProcessAfterInitialization\r");
		return bean;
	}

	
}
