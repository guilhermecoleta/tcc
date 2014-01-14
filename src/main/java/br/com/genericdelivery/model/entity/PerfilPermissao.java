package br.com.genericdelivery.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "perfil_permissao")
public class PerfilPermissao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2032241329136530472L;

	@EmbeddedId
	private PerfilPermissaoPk perfilPermissaoPk;

	@Column(name = "permissao", nullable = false, length = 30)
	@Enumerated(EnumType.STRING)
	private Permissao permissao;

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((perfilPermissaoPk == null) ? 0 : perfilPermissaoPk
						.hashCode());
		result = prime * result
				+ ((permissao == null) ? 0 : permissao.hashCode());
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
		PerfilPermissao other = (PerfilPermissao) obj;
		if (perfilPermissaoPk == null) {
			if (other.perfilPermissaoPk != null)
				return false;
		} else if (!perfilPermissaoPk.equals(other.perfilPermissaoPk))
			return false;
		if (permissao != other.permissao)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PerfilPermissao [perfilPermissaoPk=" + perfilPermissaoPk
				+ ", permissao=" + permissao + "]";
	}


}
