package spring.autowired;
 
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
 
public class Customer implements Serializable
{
	private static final long serialVersionUID = -6618287457929417920L;
	
	@Qualifier("PersonBean1")//Para el caso que haya mas de uno y quieras especificar cual quieres
	@Autowired (required=false)//Se pone required a false cuando suponemos que puede no haber ninguno y as� no da error
	//@Autowired
	private Person person;
	private int type;
	private String action;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	
	@Override
	public String toString() {
		String reply;
		if (person!=null)
			reply= "Customer [person=" + person.toString() + ", type=" + type + ", action="+ action + "]";
		else
			reply= "Customer [type=" + type + ", action="+ action + "]";
		
		return reply;
	}
	
	
}