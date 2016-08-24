/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.control.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.model.Usuarios;
import br.com.control.util.Util;

/**
 *
 * @author Leonardo
 */

@Repository
@Transactional
public class UsuarioDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	private void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveUsuario(Usuarios usuario) {
		try {
			usuario.setSenha(Util.cript(usuario.getSenha()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getSessionFactory().getCurrentSession().saveOrUpdate(usuario);
	}

	public void deleteUsuario(Usuarios usuario) {
		getSessionFactory().getCurrentSession().delete(usuario);
	}

	public void updateUsuario(Usuarios usuario) {
		getSessionFactory().getCurrentSession().update(usuario);
	}

	public Usuarios getUsuarioById(Integer id) {
		Usuarios usuarios = (Usuarios) getSessionFactory().getCurrentSession().get(Usuarios.class, id);

		return usuarios;

	}

	public List<Usuarios> getUsuario() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Usuarios").list();
		return list;
	}

	public Usuarios getUsuario(String user, String senha) {

		Usuarios usuarios = null;
		boolean retorno = false;
		try {
			usuarios = (Usuarios) getSessionFactory().getCurrentSession().createCriteria(Usuarios.class)
					.add(Restrictions.eq("login", user.toUpperCase())).add(Restrictions.eq("senha", senha))
					.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error in login() --> " + e.getMessage());
		} finally {
			return usuarios;
		}
	}

}
