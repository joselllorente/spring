package spring.autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class MainApp 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beansAutowired.xml");
 
    	Customer cust = (Customer)context.getBean("CustomerBean");
    	//System.out.println(cust.toString());
    	System.out.println(cust);
 
    }
}