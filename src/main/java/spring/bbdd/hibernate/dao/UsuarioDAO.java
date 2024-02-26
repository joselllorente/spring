package spring.bbdd.hibernate.dao;

import spring.bbdd.hibernate.entities.Usuario;

public interface UsuarioDAO {

	public void guardarUsuario(Usuario usuario);
	
	public Usuario getUsuario(String nombre);
}
