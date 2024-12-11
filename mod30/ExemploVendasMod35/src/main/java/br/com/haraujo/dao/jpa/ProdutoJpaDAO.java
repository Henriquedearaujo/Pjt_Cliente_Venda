/**
 * 
 */
package br.com.haraujo.dao.jpa;

import br.com.haraujo.dao.generic.jpa.GenericJpaDAO;
import br.com.haraujo.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
