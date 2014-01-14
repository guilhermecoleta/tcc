package br.com.genericdelivery.model.dao.interfaces;

import br.com.genericdelivery.model.entity.Funcionalidade;
import br.com.genericdelivery.model.entity.Permissao;
import br.com.genericdelivery.model.entity.Usuario;

public interface UsuarioDAO {

	Usuario findByLoginAndPassword(String login, String password);

	Permissao findPermissao(Integer id, Funcionalidade funcionalidade);

	void save(Usuario usuario);

	void update(Usuario usuario);

	boolean verificarCPFExistente(String value, Integer id);

	boolean verificarEmailExistente(String email, Integer id);

	boolean verificarFacebookExistente(String facebook, Integer id);

}
