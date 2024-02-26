package spring.bbdd.jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import spring.bbdd.jdbc.pojos.Paciente;

//Spring es el que hace el executeQuery() y le decimos c�mo lo va a tratar por cada fila del resultado. 
//Esto se hace implementado la interfaz org.springframework.jdbc.core.RowMapper
public class PacienteMapper implements RowMapper {

	public Paciente mapRow(ResultSet rs, int row) throws SQLException {
		Paciente patient = new Paciente();
		try {
			
		    patient.setId(rs.getInt(1));
		    patient.setName(rs.getString(2));
		    patient.setLastName(rs.getString(3));
		    patient.setRoomId(rs.getInt(4));
		    
		} catch (SQLException sqe) {
			System.out.println("Sin resultados");
		}
		return patient;
	 }
}
