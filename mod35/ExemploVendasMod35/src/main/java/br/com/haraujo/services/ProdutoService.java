/**
 * 
 */
package br.com.haraujo.services;

import br.com.haraujo.dao.IProdutoDAO;
import br.com.haraujo.domain.Produto;
import br.com.haraujo.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
