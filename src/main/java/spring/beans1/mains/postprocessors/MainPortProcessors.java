package spring.beans1.mains.postprocessors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.beans1.beans.postprocessors.AppCfg;

public class MainPortProcessors {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("BeansPostProcessors.xml");
		Object bean = applicationContext.getBean("AppCfg");
        AppCfg appCfg = (AppCfg)bean;
        
        System.out.println(String.format("Property #1: %s", appCfg.getCfgProperty1()));
        System.out.println(String.format("Property #2: %s", appCfg.getCfgProperty1()));

	}

}
