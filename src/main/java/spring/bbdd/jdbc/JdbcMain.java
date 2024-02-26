package spring.bbdd.jdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.bbdd.jdbc.impl.PacienteJDBCTemplate;
import spring.bbdd.jdbc.pojos.Paciente;

public class JdbcMain {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//PacienteDaoJDBC pacienteJdbc = new PacienteDaoJDBC();

		ApplicationContext context = new ClassPathXmlApplicationContext("beansJDBC.xml");
		PacienteJDBCTemplate pacienteJDBCTemplate = (PacienteJDBCTemplate) context.getBean("pacienteJDBCTemplate");
		System.out.println("Borrando Tabla");
		pacienteJDBCTemplate.borrarTabla();
		System.out.println("Creando Tabla");
		pacienteJDBCTemplate.crearTabla();

		Paciente paciente0 = new Paciente("Maria", "Tome");
		paciente0.setId(0);
		paciente0.setRoomId(1);
		
		Paciente paciente1 = new Paciente("Juan", "Lopez");
		paciente1.setId(1);
		paciente1.setRoomId(1);
		
		pacienteJDBCTemplate.save(paciente0);
		pacienteJDBCTemplate.save(paciente1);

		Paciente p=	pacienteJDBCTemplate.findPaciente(0);
		System.out.println(p);

		System.out.println("Pacientes en la habitaci�n 1: "+pacienteJDBCTemplate.countByRoom(1));
		System.out.println("Pacientes en la habitaci�n 2: "+pacienteJDBCTemplate.countByRoom(2));
	
		System.out.println("========================================================================");
		paciente1.setRoomId(2);
		pacienteJDBCTemplate.updatePaciente(paciente1);

		System.out.println("Pacientes en la habitaci�n 1: "+pacienteJDBCTemplate.countByRoom(1));
		System.out.println("Pacientes en la habitaci�n 2: "+pacienteJDBCTemplate.countByRoom(2));

//		System.out.println("========================================================================");

		pacienteJDBCTemplate.generateReport();

//		System.out.println("========================================================================");

//		List lPacientesGenerico = pacienteJDBCTemplate.findByRoomGeneric(1);
//		Iterator ite = lPacientesGenerico.iterator();
//		while (ite.hasNext()){
//			Map tipo = (Map)ite.next();
//			System.out.println("ID: "+tipo.get("ID") +" NAME: "+	tipo.get("NAME") + " LASTNAME:" +tipo.get("LASTNAME") +
//					" ROOMID: " + tipo.get("ROOMID"));
//		}

		System.out.println("========================================================================");

		List<Paciente> lPacientes = pacienteJDBCTemplate.findByRoom(1);
		for (Paciente paciente : lPacientes) {
			System.out.println("En la habitacion 1 "+paciente.toString());
		}

		System.out.println("========================================================================");

		int numPacientes = pacienteJDBCTemplate.numPacientes(paciente1);
		System.out.println("El numero de pacientes que se llaman "+paciente1.getName() + " es de " + numPacientes);

		pacienteJDBCTemplate.deletePaciente(paciente1);
		pacienteJDBCTemplate.generateReport();
		pacienteJDBCTemplate.deletePaciente(paciente0);
		System.out.println("Borrados pacientes");
		System.out.println("========================================================================");

		pacienteJDBCTemplate.generateReport();
//		System.out.println("Informe generado");

		System.out.println("Fin");

	}

}
