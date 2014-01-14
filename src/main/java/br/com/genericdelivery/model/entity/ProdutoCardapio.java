package br.com.genericdelivery.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema="tcc", name = "produto_cardapio")
public class ProdutoCardapio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2902434514829176011L;
	
	@EmbeddedId
	private ProdutoCardapioPk produtoCardapioPk;

	@Column(name = "valor", nullable = false)
	private Double valor;

	public ProdutoCardapioPk getProdutoCardapioPk() {
		return produtoCardapioPk;
	}

	public void setProdutoCardapioPk(ProdutoCardapioPk produtoCardapioPk) {
		this.produtoCardapioPk = produtoCardapioPk;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((produtoCardapioPk == null) ? 0 : produtoCardapioPk
						.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		ProdutoCardapio other = (ProdutoCardapio) obj;
		if (produtoCardapioPk == null) {
			if (other.produtoCardapioPk != null)
				return false;
		} else if (!produtoCardapioPk.equals(other.produtoCardapioPk))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProdutoCardapio [produtoCardapioPk=" + produtoCardapioPk
				+ ", valor=" + valor + "]";
	}
	


}
