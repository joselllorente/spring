package spring.ejercicios.logs; 

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("LogGetafe")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LogGetafe {
	@Value("2")
	private int nivelLog;
	
	public LogGetafe() {
		System.out.println("Constructor LogGetafe vacio");
	}
	public LogGetafe(int nivelLog) {
		System.out.println("Constructor LogGetafe");
		this.nivelLog = nivelLog;
	}
	
	
	public int getNivelLog() {
		return nivelLog;
	}
	
	public void setNivelLog(int nivelLog) {
		this.nivelLog = nivelLog;
	}

	
	
	public void trace (String msg) {
		pintaTraza(msg, EnumLogs.TRACE);
	}
	public void debug (String msg) {
		pintaTraza(msg, EnumLogs.DEBUG);
	}
	public void info (String msg) {
		pintaTraza(msg, EnumLogs.INFO);
	}
	public void warning (String msg) {
		pintaTraza(msg, EnumLogs.WARNING);
	}
	public void error (String msg) {
		pintaTraza(msg, EnumLogs.ERROR);
	}
	public void fatal (String msg) {
		pintaTraza(msg, EnumLogs.FATAL);
	}
	
	
	private void pintaTraza(String msg, EnumLogs log ) {
		if (log.ordinal() >= this.nivelLog) {
			System.out.println(log.getMsg() + " " + msg);
		}
	}
	
}
