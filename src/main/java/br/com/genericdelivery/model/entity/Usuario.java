package br.com.genericdelivery.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.genericdelivery.util.annotations.Required;
import br.com.genericdelivery.util.annotations.RequiredObject;

@Entity
@Table(schema = "tcc", name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3746862374430570964L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@Column(name = "data_nascimento", nullable = false)
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dataNascimento;

	@Column(name = "email", nullable = false, unique = true, length = 100)
	private String email;

	@Column(name = "senha", nullable = false, length = 20)
	private String senha;

	@Column(name = "ativo", nullable = false)
	private Boolean ativo;

	@Column(name = "cpf", unique = true, length = 14, nullable = false)
	private String cpf;

	@Column(name = "facebook", nullable = true, length = 255, unique = true)
	private String facebook;

	@Column(name = "telefone", length = 20, nullable = true)
	private String telefone;

	@Column(name = "login", length = 15, nullable = false, unique = true)
	private String login;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "endereco", nullable = false)
	private Endereco endereco;

	@ManyToOne
	@JoinColumn(name = "perfil", nullable = false)
	private Perfil perfil;

	@Column(name = "telefone_contato", length = 20, nullable = true)
	private String telefoneContato;

	@Column(name = "celular", length = 20, nullable = true)
	private String celular;

	@Transient
	private TipoLogradouro[] values;

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", email=" + email + ", senha=" + senha + ", ativo=" + ativo
				+ ", cpf=" + cpf + ", facebook=" + facebook + ", telefone=" + telefone + ", login=" + login + ", endereco=" + endereco + ", perfil=" + perfil
				+ ", telefoneContato=" + telefoneContato + ", celular=" + celular + "]";
	}

	public String getTelefoneContato() {
		return telefoneContato;
	}

	public void setTelefoneContato(String telefoneContato) {
		this.telefoneContato = telefoneContato;
	}

	@Required
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Required
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Required
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Required
	public Boolean getAtivo() {
		if (ativo == null)
			ativo = true;
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	@Required
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		if (endereco == null) {
			endereco = new Endereco();
		}

		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@RequiredObject
	public Perfil getPerfil() {
		if (perfil == null)
			perfil = new Perfil();
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Required
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public TipoLogradouro[] getValues() {
		return TipoLogradouro.values();
	}

	public void setValues(TipoLogradouro[] values) {
		this.values = values;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((facebook == null) ? 0 : facebook.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((telefoneContato == null) ? 0 : telefoneContato.hashCode());
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
		Usuario other = (Usuario) obj;
		if (ativo == null) {
			if (other.ativo != null)
				return false;
		} else if (!ativo.equals(other.ativo))
			return false;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (facebook == null) {
			if (other.facebook != null)
				return false;
		} else if (!facebook.equals(other.facebook))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (telefoneContato == null) {
			if (other.telefoneContato != null)
				return false;
		} else if (!telefoneContato.equals(other.telefoneContato))
			return false;
		return true;
	}

}
