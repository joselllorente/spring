package spring.ejercicios.tienda.beans;

import java.util.Map;

public class Tienda {

	private String nombre;
	private Map<String,Maniqui> maniquies;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the maniquies
	 */
	public Map<String, Maniqui> getManiquies() {
		return maniquies;
	}

	/**
	 * @param maniquies the maniquies to set
	 */
	public void setManiquies(Map<String, Maniqui> maniquies) {
		this.maniquies = maniquies;
	}
	
	
	
		
}
