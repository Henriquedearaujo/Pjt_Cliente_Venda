/**
 * 
 */
package br.com.haraujo.dao.jpa;


import br.com.haraujo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.haraujo.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa>{


	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}
}
