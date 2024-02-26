package spring.ejercicios.herenciaprensa;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import spring.ejercicios.logs.LogGetafe;

public class Persona {
	@Autowired
	private LogGetafe logGetafe;

	@Autowired
	private ServicioPrensa servicioPrensa;
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String genero;
	private String tipoSuscripcion;//free,basic,premium
	
	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public Persona(String nombre, String apellidos, String dni, String genero, String tipoSuscripcion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.genero = genero;
		this.tipoSuscripcion = tipoSuscripcion;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the tipoSuscripcion
	 */
	public String getTipoSuscripcion() {
		return tipoSuscripcion;
	}

	/**
	 * @param tipoSuscripcion the tipoSuscripcion to set
	 */
	public void setTipoSuscripcion(String tipoSuscripcion) {
		this.tipoSuscripcion = tipoSuscripcion;
	}

	/**
	 * @return the servicioPrensa
	 */
	public ServicioPrensa getServicioPrensa() {
		return servicioPrensa;
	}

	
	
	/**
	 * @return the logGetafe
	 */
	public LogGetafe getLogGetafe() {
		return logGetafe;
	}

	/**
	 * @param logGetafe the logGetafe to set
	 */
	public void setLogGetafe(LogGetafe logGetafe) {
		this.logGetafe = logGetafe;
	}

	/**
	 * @param servicioPrensa the servicioPrensa to set
	 */
	public void setServicioPrensa(ServicioPrensa servicioPrensa) {
		this.servicioPrensa = servicioPrensa;
	}

	@Override
	public String toString() {
		return "Persona [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + (dni != null ? "dni=" + dni + ", " : "")
				+ (genero != null ? "genero=" + genero + ", " : "")
				+ (tipoSuscripcion != null ? "tipoSuscripcion=" + tipoSuscripcion : "") + "]";
	}
	
	
	
	public void solicitarLectura() {
		List<String> periodicos = servicioPrensa.mostrarPrensa(tipoSuscripcion);
		System.out.println(this.getNombre() + " estos son los periodicos que puedes leer:");
		for (String periodico : periodicos) {
			System.out.println("\t"+periodico);
		}
	}
	
	public String seleccionaPeriodico() {
		
		System.out.println("Selecciona un periodico");
		Scanner scan = new Scanner(System.in);
		String periodicoSeleccionado = scan.nextLine();
		
		return periodicoSeleccionado;
	}
	
	public void leer(String periodico) {
		servicioPrensa.leerPeriodico(periodico);
	}
	
	
	public void iniciarLectura() {
		logGetafe.trace("Iniciando el método iniciarLectura para el usuario "+this);
		solicitarLectura();
		leer(seleccionaPeriodico());
		logGetafe.info("Finalizado el método iniciarLectura para el usuario "+this);
	}
	
}










