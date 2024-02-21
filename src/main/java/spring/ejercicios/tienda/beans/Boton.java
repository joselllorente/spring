package spring.ejercicios.tienda.beans;

public class Boton {
	private static int contador;
	private long id;
	private String forma;
	private double tamaño;
	private String color;

	public Boton(long id, String forma, double tamaño, String color) {
		System.out.println("Constructor boton" +contador);
		this.id = contador++;
		this.forma = forma;
		this.tamaño = tamaño;
		this.color = color;
	}

	public long getId() {
		return id;
	}

	public String getForma() {
		return forma;
	}

	public double getTamaño() {
		return tamaño;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Boton [id=" + id + ", " + (forma != null ? "forma=" + forma + ", " : "") + "tamaño=" + tamaño + ", "
				+ (color != null ? "color=" + color : "") + "]";
	}

	
}
