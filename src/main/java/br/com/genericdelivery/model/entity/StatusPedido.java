package br.com.genericdelivery.model.entity;

public enum StatusPedido {
	AGUARDANDO("aguardando", "Aguardando Aprovação");
	//TODO outros status
	
	private String status;
	private String descricao;


	private StatusPedido(String status, String descricao) {
		this.status = status;
		this.descricao = descricao;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
