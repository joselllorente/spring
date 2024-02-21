package spring.autowired;

import java.io.Serializable;

public class Person implements Serializable{
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
	
}
