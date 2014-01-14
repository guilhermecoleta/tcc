package br.com.genericdelivery.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema="tcc", name = "cardapio")
public class Cardapio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2011581397801625004L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Id", nullable = false)
	private Integer id;
	
	@Column(name = "data_hora", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHora;
	
	@Column(name = "ativo", nullable = false)
	private Boolean ativo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataHora() {
		if(dataHora == null) dataHora = new Date();
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Boolean getAtivo() {
		if(ativo == null) ativo = true;
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
}
