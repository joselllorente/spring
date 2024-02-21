package spring.anotaciones;

import java.io.Serializable;

//import org.springframework.beans.factory.annotation.Required;

public class Student implements Serializable {

	private Integer age;
	private String name;
	
	public Student(){
		
	}

	public Integer getAge() {
		return age;
	}

	//@Required
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	//@Required
	public void setName(String name) {
		this.name = name;
	}
}
