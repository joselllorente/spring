package spring.ejercicios.tienda.beans;

public class Boton {
	private static int contador;
	private long id;
	private String forma;
	private double tamanio;
	private String color;

	public Boton(long id, String forma, double tamanio, String color) {
		System.out.println("Constructor boton" +contador);
		this.id = contador++;
		this.forma = forma;
		this.tamanio = tamanio;
		this.color = color;
	}

	public long getId() {
		return id;
	}

	public String getForma() {
		return forma;
	}

	public double getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Boton [id=" + id + ", " + (forma != null ? "forma=" + forma + ", " : "") + "tamanio=" + tamanio + ", "
				+ (color != null ? "color=" + color : "") + "]";
	}

	
}
