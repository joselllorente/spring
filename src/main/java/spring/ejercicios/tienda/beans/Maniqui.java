package spring.ejercicios.tienda.beans;

public class Maniqui {
	private long id;
	private Camisa camisa;
	private Pantalon pantalon;

	
	//Constructores
	public Maniqui(long id) {
		this.id = id;
	}

	
	public Maniqui(long id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
	}

	
	

	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public long getId() {
		return id;
	}

	//Métodos
	public void desvestir() {
		this.camisa = null;
		this.pantalon = null;
	}
	
	
	public void vestir(Pantalon pantalon, Camisa camisa) {
		desvestir();
		this.camisa = camisa;
		this.pantalon = pantalon;
	}


	@Override
	public String toString() {
		return "Maniqui [id=" + id + ", " + (camisa != null ? "camisa=" + camisa + ", " : "")
				+ (pantalon != null ? "pantalon=" + pantalon : "") + "]";
	}
	
	
}
