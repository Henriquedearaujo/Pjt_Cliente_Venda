/**
 * 
 */
package br.com.haraujo.dao.jpa;

import br.com.haraujo.dao.generic.jpa.GenericJpaDAO;
import br.com.haraujo.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
