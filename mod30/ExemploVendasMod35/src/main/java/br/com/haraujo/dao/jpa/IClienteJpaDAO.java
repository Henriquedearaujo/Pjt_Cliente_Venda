/**
 * 
 */
package br.com.haraujo.dao.jpa;

import br.com.haraujo.dao.generic.jpa.IGenericJapDAO;
import br.com.haraujo.domain.jpa.ClienteJpa;


public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
