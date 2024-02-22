package spring.anotaciones;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student2")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Student2 implements Serializable{

	private Integer age;
	private String name;
	
	public Student2(){
		//this.age=26;
		this.name="Angel";
	}

	public Student2(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}



	public Integer getAge() {
		return age;
	}
	
	@Value("35")
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
}
