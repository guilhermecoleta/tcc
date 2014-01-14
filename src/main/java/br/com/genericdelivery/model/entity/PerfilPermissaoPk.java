package br.com.genericdelivery.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class PerfilPermissaoPk implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7940693296866438534L;

	@Column(name = "funcionalidade", nullable = false, length = 30)
	@Enumerated(EnumType.STRING)
	private Funcionalidade funcionalidade;
	
	@Column(name = "perfil", nullable = false)
	private Perfil perfil;

	public Funcionalidade getFuncionalidade() {
		return funcionalidade;
	}

	public void setFuncionalidade(Funcionalidade funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((funcionalidade == null) ? 0 : funcionalidade.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PerfilPermissaoPk other = (PerfilPermissaoPk) obj;
		if (funcionalidade != other.funcionalidade)
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PerfilPermissaoPk [funcionalidade=" + funcionalidade
				+ ", perfil=" + perfil + "]";
	}
}
