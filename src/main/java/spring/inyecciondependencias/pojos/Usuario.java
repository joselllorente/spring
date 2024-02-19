package spring.inyecciondependencias.pojos;

import java.io.Serializable;

public class Usuario implements Serializable {

	private static final long serialVersionUID = -36456639158853318L;
	private String nombre;
	private int edad;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
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
		return "Usuario [nombre=" + nombre + ", edad=" + edad + "]";
	}

	
}
