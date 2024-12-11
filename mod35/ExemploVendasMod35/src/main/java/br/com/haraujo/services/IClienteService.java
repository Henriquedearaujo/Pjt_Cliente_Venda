/**
 * 
 */
package br.com.haraujo.services;

import br.com.haraujo.domain.Cliente;
import br.com.haraujo.exceptions.DAOException;
import br.com.haraujo.services.generic.IGenericService;


public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
