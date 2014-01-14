package br.com.genericdelivery.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "produto_pedido")
public class ProdutoPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4672568553421754002L;

	@EmbeddedId
	private ProdutoPedidoPk produtoPedidoPk;
	
	@Column(name = "quantidade", nullable = false)
	private Double quantidade;
	
	@Column(name = "valor", nullable = false)
	private Double valor;


	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public ProdutoPedidoPk getProdutoPedidoPk() {
		return produtoPedidoPk;
	}

	public void setProdutoPedidoPk(ProdutoPedidoPk produtoPedidoPk) {
		this.produtoPedidoPk = produtoPedidoPk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((produtoPedidoPk == null) ? 0 : produtoPedidoPk.hashCode());
		result = prime * result
				+ ((quantidade == null) ? 0 : quantidade.hashCode());
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
		ProdutoPedido other = (ProdutoPedido) obj;
		if (produtoPedidoPk == null) {
			if (other.produtoPedidoPk != null)
				return false;
		} else if (!produtoPedidoPk.equals(other.produtoPedidoPk))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
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
		return "ProdutoPedido [produtoPedidoPk=" + produtoPedidoPk
				+ ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}
	
	
}
