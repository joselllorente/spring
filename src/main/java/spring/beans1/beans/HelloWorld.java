package spring.beans1.beans;

import java.io.Serializable;

public class HelloWorld implements Serializable{

	private String message;

	public HelloWorld() {
		System.out.println("Llamada a constructor");
		//this.message="Hello World!";
	}

	public String getMessage() {
		System.out.println("Mensaje: "+message);
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Estableciendo valor "+message);
		this.message = message;
	}
	
	
}
