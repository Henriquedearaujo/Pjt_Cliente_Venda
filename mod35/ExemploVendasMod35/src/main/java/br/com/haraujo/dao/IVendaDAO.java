/**
 * 
 */
package br.com.haraujo.dao;

import br.com.haraujo.dao.generic.IGenericDAO;
import br.com.haraujo.domain.Venda;
import br.com.haraujo.exceptions.DAOException;
import br.com.haraujo.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
