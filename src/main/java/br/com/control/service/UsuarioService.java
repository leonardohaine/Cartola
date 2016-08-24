package br.com.control.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.control.dao.UsuarioDAO;
import br.com.control.model.Usuarios;

@Service("UsuarioService")
@Transactional(readOnly = true)
public class UsuarioService {

	@Autowired
	UsuarioDAO usuarioDAO;

	@Transactional(readOnly = false)
	public void saveUsuario(Usuarios usuarios) {
		getUsuarioDAO().saveUsuario(usuarios);
	}

	@Transactional(readOnly = false)
	public void deleteUsuario(Usuarios usuarios) {
		getUsuarioDAO().deleteUsuario(usuarios);
	}

	@Transactional(readOnly = false)
	public void updateUsuario(Usuarios usuarios) {
		getUsuarioDAO().updateUsuario(usuarios);
	}

	public Usuarios geUsuarioById(Integer id) {
		return getUsuarioDAO().getUsuarioById(id);
	}

	/**
	 * @return the usuarioDAO
	 */
	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	/**
	 * @param safx04DAO
	 *            the usuarioDAO to set
	 */
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

	public List<Usuarios> getUsuario() {
		return getUsuarioDAO().getUsuario();
	}

}
