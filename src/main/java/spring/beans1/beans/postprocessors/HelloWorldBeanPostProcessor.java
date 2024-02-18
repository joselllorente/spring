package spring.beans1.beans.postprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class HelloWorldBeanPostProcessor implements BeanPostProcessor {

    /**
     * Método que se ejecuta antes de inicializar el bean
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        
        System.out.println(String.format("Inicializando bean %s",beanName));
        return bean;
    }

    /**
     * Método que se ejecuta después de inicializar el bean
     */
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        
        System.out.println(String.format("Bean %s inicialilizado correctamente", beanName));
        return bean;
    }

    
    
}