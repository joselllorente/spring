package spring.beans1.beans.postprocessors;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.StringUtils;

public class AppCfgBeanPostProcessor implements BeanPostProcessor {

    /**
     * Método que se ejecuta antes de inicializar el bean
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        
        return bean;
    }

    /**
     * Método que se ejecuta después de inicializar el bean. 
     * Comprueba que todas las propiedades de la aplicación han sido rellenadas
     */
    @SuppressWarnings("serial")
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        

        boolean allPropsConfigured = true;
        
        try {   

            if(bean instanceof AppCfg) {
                
                AppCfg appCfg = (AppCfg)bean;
                
                Method[] methods = appCfg.getClass().getMethods();
                
                for(int i=0; i<methods.length ; i++) {
                    
                    Method method = methods[i];
                    
                    if(method.getName().startsWith("get")) {
                        Object ret = method.invoke(appCfg, new Object[0]);
                        
                        //Se comprueba que la propiedad no sea nula ni vacía (en caso de ser String)
                        if(ret == null || (ret instanceof String && StringUtils.isEmpty((String)ret))) {
                            allPropsConfigured = false;
                            break;
                        }
                        
                    }
                }
            }
            
            if(!allPropsConfigured) {
                throw new BeansException("No se han configurado todas las propiedades") {};
            }else{
            	System.out.println(String.format("Bean %s inicialilizado correctamente", beanName));
            }
        
        } catch(InvocationTargetException e) {
            throw new BeansException("Clase AppCfg mal configurada") {};
        } catch(IllegalAccessException e) {
            throw new BeansException("Clase AppCfg mal configurada") {};
        }
        
        return bean;
    }
    
}
