package spring.bbdd.jdbc.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import spring.bbdd.jdbc.dao.IPacienteDao;
import spring.bbdd.jdbc.pojos.Paciente;

public class PacienteDaoJDBC implements IPacienteDao {
	 
    private Connection connection;
 
    public PacienteDaoJDBC() {
    	 
 		try {
 			Class.forName("oracle.jdbc.driver.OracleDriver");
 			this.connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "spring", "spring");

 		} catch (SQLException e1) {
 			e1.printStackTrace();
 		}catch (ClassNotFoundException e2) {
 			e2.printStackTrace();
 		}
       
    }
 
    public List findByRoom(Integer roomId) {
 
        List<Paciente> patients = new ArrayList();
       
        PreparedStatement query = null;
 
        String queryString = "SELECT ID, NAME, LASTNAME FROM T_PATIENT WHERE ROOMID=?";
 
        try {
 
            query = connection.prepareStatement(queryString);
            query.setInt(1, roomId);
 
            ResultSet rs = query.executeQuery();
 
            while (rs.next()) {
                Integer id = rs.getInt("ID");
                String name = rs.getString("NAME");
                String lastName = rs.getString("LASTNAME");
                Paciente paciente = new Paciente(name,lastName);
                paciente.setId(id);
                paciente.setRoomId(roomId);
                patients.add(paciente);
            }
 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (query != null) {
                    query.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
 
        return patients;
 
    }

	public Integer countByRoom(Integer roomId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateRoom(Paciente patient) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int save(Paciente patient) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void generateReport() {
		// TODO Auto-generated method stub
		
	}

	public List findByRoomGeneric(Integer roomId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updatePaciente(Paciente patient) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deletePaciente(Paciente patient) {
		// TODO Auto-generated method stub
		return 0;
	}
    
    
 
}

