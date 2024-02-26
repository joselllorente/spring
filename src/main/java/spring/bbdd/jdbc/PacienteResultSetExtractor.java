package spring.bbdd.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import spring.bbdd.jdbc.pojos.Paciente;

public class PacienteResultSetExtractor implements ResultSetExtractor {

	public Set<Paciente> extractData(ResultSet rs) throws SQLException, DataAccessException {
		 
	     Set<Paciente> patientsSet = new HashSet<Paciente>();
	     while(rs.next()) {
	        Paciente patient = new Paciente();
		    patient.setId(rs.getInt(1));
		    patient.setName(rs.getString(2));
		    patient.setLastName(rs.getString(3));
		    patientsSet.add(patient);
	     }
	     return patientsSet;
	  }


}
