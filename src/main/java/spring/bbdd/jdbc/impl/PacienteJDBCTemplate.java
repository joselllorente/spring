package spring.bbdd.jdbc.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import spring.bbdd.jdbc.PacienteRowCallbackHandler;
import spring.bbdd.jdbc.dao.IPacienteDao;
import spring.bbdd.jdbc.mapper.PacienteMapper;
import spring.bbdd.jdbc.pojos.Paciente;

public class PacienteJDBCTemplate implements IPacienteDao {
	 
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    
    public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}
    
    public Integer countByRoom(Integer roomId) {
    	String sql="SELECT COUNT(*) FROM T_PATIENT WHERE ROOMID=?";
    	return jdbcTemplate.queryForObject(sql, Integer.class, roomId);
    }
    
    public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Paciente findPaciente(Integer pacienteId) {
    	String SQL = "select * from T_PATIENT where id = ?";
		Object [] oPaciente = {pacienteId};
		Paciente paciente = null;

		try{
			paciente = jdbcTemplate.queryForObject(SQL,oPaciente, new PacienteMapper());
		}catch(Exception e){
			System.out.println("Sin resultado");
		}
		return paciente;
    }
    
    
    //El resultado ser� un objeto List que contendr� una serie de Map gen�ricos
    public List findByRoomGeneric(Integer roomId) {
		Object [] rooms = new Object[]{roomId};
		return jdbcTemplate.queryForList("SELECT * FROM T_PATIENT WHERE ROOMID=?", rooms);
    }

    //Como devolver un listado de entidades de la clase Patient
	public List<Paciente> findByRoom(Integer roomId) {
		List<Paciente> reply=null;
		Object [] rooms = new Object[]{roomId};
		reply= jdbcTemplate.query("SELECT ID, NAME, LASTNAME, ROOMID FROM T_PATIENT WHERE ROOMID=?", rooms, new PacienteMapper());
		return reply;

	}
	
	//Si no hubiese que devolver ning�n resultado, procesar una a una las filas del resultado y generar un informe con ellas
	public void generateReport() {
		jdbcTemplate.query("SELECT * FROM T_PATIENT", new PacienteRowCallbackHandler());
	}

	
	public int save(Paciente patient) {
	   return jdbcTemplate.update("INSERT INTO T_PATIENT(ID, NAME, "
	   		+ "LASTNAME, ROOMID) "+
			   "VALUES (?,?,?,?)",patient.getId(), patient.getName(), 
			   patient.getLastName(), patient.getRoomId());
	}

	public int updatePaciente(Paciente patient) {
	   return jdbcTemplate.update("UPDATE T_PATIENT SET ROOMID=? WHERE ID=?",patient.getRoomId(), patient.getId());
	}

	
	public int deletePaciente(Paciente patient) {
		   return jdbcTemplate.update("DELETE T_PATIENT WHERE ID=?", patient.getId());
	}
    
	public void crearTabla (){
		this.jdbcTemplate.execute("create table T_PATIENT (ID integer, NAME varchar(100), LASTNAME varchar(100), ROOMID integer)");
	}
	
	public void borrarTabla (){
		try{	
			this.jdbcTemplate.execute("drop table T_PATIENT");
		}catch (Exception e){
			System.out.println("La tabla no existe");
			//e.printStackTrace();
		}
	}
	
	public int numPacientes (Paciente paciente){
		String sql = "SELECT count(*) FROM T_PATIENT WHERE NAME = :name";
		// Permite evitar crear un MAP de parametros y utilizar directamente el objeto paciente
		// los atributos que coincidan con el nombre de los parametros por nombre del query
		// seran utilizados y proporcionados como atributos al query
		SqlParameterSource namedParameters = new BeanPropertySqlParameterSource(paciente);
		return this.namedParameterJdbcTemplate.queryForObject(sql, namedParameters, Integer.class);
		//return this.namedParameterJdbcTemplate.queryForInt(sql, namedParameters);
	}
}

