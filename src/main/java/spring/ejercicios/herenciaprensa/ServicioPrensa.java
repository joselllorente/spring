package spring.ejercicios.herenciaprensa;

import java.util.List;

public class ServicioPrensa {

	private List<String> periodicos;

	public ServicioPrensa(List<String> periodicos) {
		super();
		this.periodicos = periodicos;
	}

	/**
	 * @return the periodicos
	 */
	public List<String> getPeriodicos() {
		return periodicos;
	}

	/**
	 * @param periodicos the periodicos to set
	 */
	public void setPeriodicos(List<String> periodicos) {
		this.periodicos = periodicos;
	}
	
	public List<String> mostrarPrensa(String tipoSuscripcion){
		List<String> listaEnvio=null;

		
		if (tipoSuscripcion.equals("free")) {
			listaEnvio = periodicos.subList(0, 1);
		}else if (tipoSuscripcion.equals("basic")) {
			listaEnvio = periodicos.subList(0, periodicos.size()/2);
		}else if (tipoSuscripcion.equals("premium")) {
			listaEnvio = periodicos;
		}
		
		return listaEnvio;
	}
	
	public void leerPeriodico(String periodico) {
		
		if (this.periodicos.contains(periodico)) {
			System.out.println("leyendo "+periodico);
		}else {
			System.out.println("Periódico inexistente");
		}
		
	}
	
}








