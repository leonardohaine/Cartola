/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.control.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Leonardo
 */
@Entity
@Table(name = "usuarios")
@NamedQueries({ @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
		@NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.codusuario = :codusuario"),
		@NamedQuery(name = "Usuarios.findByNome", query = "SELECT u FROM Usuarios u WHERE u.nome = :nome"),
		@NamedQuery(name = "Usuarios.findBySenha", query = "SELECT u FROM Usuarios u WHERE u.senha = :senha"),
		@NamedQuery(name = "Usuarios.findByCheckusuarios", query = "SELECT u FROM Usuarios u WHERE u.checkusuarios = :checkusuarios"),
		@NamedQuery(name = "Usuarios.findByIsadmin", query = "SELECT u FROM Usuarios u WHERE u.isadmin = :isadmin") })
public class Usuarios implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_USU")
	@SequenceGenerator(name = "SEQ_USU", sequenceName = "seq_usuarios")
	@Basic(optional = false)
	@Column(name = "codusuario")
	private Integer codusuario;
	@Column(name = "login")
	private String login;
	@Column(name = "nome")
	private String nome;
	@Column(name = "email")
	private String email;
	@Column(name = "senha")
	private String senha;
	@Column(name = "checksafx0708")
	private Boolean checksafx0708;
	@Column(name = "checksafx04")
	private Boolean checksafx04;
	@Column(name = "checkusuarios")
	private Boolean checkusuarios;
	@Column(name = "checkconfig")
	private Boolean checkconfig;
	@Column(name = "checksafx2013")
	private Boolean checksafx2013;
	@Column(name = "isadmin")
	private Boolean isadmin;
	@Column(name = "isativo")
	private Boolean isativo;

	public Usuarios() {
	}

	public Usuarios(Integer codusuario) {
		this.codusuario = codusuario;
	}

	public Integer getCodusuario() {
		return codusuario;
	}

	public void setCodusuario(Integer codusuario) {
		this.codusuario = codusuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getCheckusuarios() {
		return checkusuarios;
	}

	public void setCheckusuarios(Boolean checkusuarios) {
		this.checkusuarios = checkusuarios;
	}

	public Boolean getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(Boolean isadmin) {
		this.isadmin = isadmin;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codusuario != null ? codusuario.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Usuarios)) {
			return false;
		}
		Usuarios other = (Usuarios) object;
		if ((this.codusuario == null && other.codusuario != null)
				|| (this.codusuario != null && !this.codusuario.equals(other.codusuario))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "model.Usuarios[ id=" + codusuario + " ]";
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the isativo
	 */
	public Boolean getIsativo() {
		return isativo;
	}

	/**
	 * @param isativo
	 *            the isativo to set
	 */
	public void setIsativo(Boolean isativo) {
		this.isativo = isativo;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login.toUpperCase();
	}

	/**
	 * @return the checkconfig
	 */
	public Boolean getCheckconfig() {
		return checkconfig;
	}

	/**
	 * @param checkconfig
	 *            the checkconfig to set
	 */
	public void setCheckconfig(Boolean checkconfig) {
		this.checkconfig = checkconfig;
	}

	/**
	 * @return the checksafx0708
	 */
	public Boolean getChecksafx0708() {
		return checksafx0708;
	}

	/**
	 * @param checksafx0708
	 *            the checksafx0708 to set
	 */
	public void setChecksafx0708(Boolean checksafx0708) {
		this.checksafx0708 = checksafx0708;
	}

	/**
	 * @return the checksafx04
	 */
	public Boolean getChecksafx04() {
		return checksafx04;
	}

	/**
	 * @param checksafx04
	 *            the checksafx04 to set
	 */
	public void setChecksafx04(Boolean checksafx04) {
		this.checksafx04 = checksafx04;
	}

	/**
	 * @return the checksafx2013
	 */
	public Boolean getChecksafx2013() {
		return checksafx2013;
	}

	/**
	 * @param checksafx2013
	 *            the checksafx2013 to set
	 */
	public void setChecksafx2013(Boolean checksafx2013) {
		this.checksafx2013 = checksafx2013;
	}

}
