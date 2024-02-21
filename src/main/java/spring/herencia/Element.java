package spring.herencia;

import java.io.Serializable;

public class Element implements Serializable{
	private String nombre;
	
	public Element(){
		System.out.println("Inicializando Element");
	}
	public String getNombre() {
		System.out.println(nombre);
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
