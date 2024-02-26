package spring.bbdd.hibernate.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import spring.bbdd.hibernate.dao.UsuarioDAO;
import spring.bbdd.hibernate.entities.Usuario;

public class UsuarioCommand implements UsuarioDAO {

	private SessionFactory sessionFactory;
	private HibernateTemplate template;
	
	public UsuarioCommand(){
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		template=new HibernateTemplate(sessionFactory);
	}


	public void guardarUsuario(Usuario usuario) {
		template.save(usuario);
	}


	public Usuario getUsuario(String nombre) {
		String query = "from Usuario where usuario = ?";
		return (Usuario) template.find(query, nombre).get(0);
	}

}
