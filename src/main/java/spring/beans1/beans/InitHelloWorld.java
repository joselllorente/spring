package spring.beans1.beans;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class InitHelloWorld implements  BeanNameAware, 
		BeanFactoryAware, ApplicationContextAware, 
		InitializingBean, DisposableBean {
	
	String message;
	String beanId;
	
	public InitHelloWorld() {
		super();
		System.out.println("===============1. Estableciendo la instancia");
	}

	public String getMessage() {
	  return message;
	}

	public void setMessage(String message) {
		System.out.println("===============2. Estableciendo la propiedad: "+ message);
	  this.message = message;
	}


//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		//Se puede determinar por el tipo (instanceOf) puedo hacer una cosa u otra
//		System.out.println("AfterInitialization: "+beanName);
//		return bean;
//	}
//
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("BeforeInitialization: "+beanName);
//		return bean;
//	}

	public void setBeanName(String arg0) {
		System.out.println("===============3. Estableciendo beanName: "+ arg0);	
		beanId= arg0;
		
	}

	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("===============4. Accediendo Factoria");	
		System.out.println("setBeanFactory: "+factory.isSingleton(beanId) );
		InitHelloWorld ihw = (InitHelloWorld)factory.getBean("beanCicloVida");
		System.out.println("Mensaje Bean: "+ihw.getMessage());
	}
	
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("===============5. Accediendo Contexto");
		
		System.out.println("applicationContext: "+Arrays.toString(
				context.getBeanDefinitionNames()) );
		InitHelloWorld ihw = (InitHelloWorld)context.getBean("beanCicloVida");
		System.out.println("Mensaje Bean: "+ihw.getMessage());
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("===============7. afterPropertiesSet");
		System.out.println("Init method after properties are set : " + message);	
	}
	
	public void initMethod(){
		System.out.println("===============8. init-method");
		System.out.println("Bean InitHellWorld is going through init method.");
	}
	
	public void destroyMethod(){
		System.out.println("===============11. destroy-method");
		System.out.println("Bean InitHellWorld will be destroy now 2");
	}
	
	public void destroy(){
		System.out.println("===============10. destroy de DisposableBean");
		System.out.println("Bean InitHellWorld will be destroy now.");
	}
	
}
