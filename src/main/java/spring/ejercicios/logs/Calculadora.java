package spring.ejercicios.logs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Calculadora")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Calculadora {
	@Autowired
	LogGetafe log;
	@Value("1")
	int operador1;
	@Value("1")
	int operador2;
	
	public Calculadora() {
		System.out.println("Constructor calculadora vacio");
	}
	
	public Calculadora(int operador1, int operador2) {
		System.out.println("Constructor calculadora");
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	public void sumar(int operador1, int operador2){
		log.trace("El resultado es "+(operador1 + operador2));
		log.debug("El resultado es "+(operador1 + operador2));
		log.info("El resultado es "+(operador1 + operador2));
		log.warning("El resultado es "+(operador1 + operador2));
		log.error("El resultado es "+(operador1 + operador2));
		log.fatal("El resultado es "+(operador1 + operador2));
	}

	public void sumar() {
		sumar(operador1, operador2);
	}

	/**
	 * @return the log
	 */
	public LogGetafe getLog() {
		return log;
	}


	/**
	 * @param log the log to set
	 */
	public void setLog(LogGetafe log) {
		System.out.println("llamado setLog ");
		this.log = log;
	}


	/**
	 * @return the operador1
	 */
	public int getOperador1() {
		return operador1;
	}


	/**
	 * @param operador1 the operador1 to set
	 */
	public void setOperador1(int operador1) {
		this.operador1 = operador1;
	}


	/**
	 * @return the operador2
	 */
	public int getOperador2() {
		return operador2;
	}


	/**
	 * @param operador2 the operador2 to set
	 */
	public void setOperador2(int operador2) {
		this.operador2 = operador2;
	}

	
}
