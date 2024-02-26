package spring.bbdd.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;


//Procesa filas de una query
public class PacienteRowCallbackHandler implements RowCallbackHandler {

	public void processRow(ResultSet rs) throws SQLException {
		
		    System.out.println("--Paciente--");
		    System.out.println("Nombre: " + rs.getString(2));
		    System.out.println("Apellidos: " + rs.getString(3));
		    System.out.println("Habitaci�n: " + rs.getInt(4));

	}
}
