package spring.bbdd.jdbc.dao;

import java.util.List;

import spring.bbdd.jdbc.pojos.Paciente;

public interface IPacienteDao {
	
	public List<Paciente> findByRoom(Integer roomId);
	
	public Integer countByRoom(Integer roomId);
	
	public int updatePaciente(Paciente patient);
	
	public int deletePaciente(Paciente patient);
	
	public int save(Paciente patient);
	
	public void generateReport();
	
	public List findByRoomGeneric(Integer roomId);
	
}
