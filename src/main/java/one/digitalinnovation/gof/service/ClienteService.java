package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

/**
 * Interface que define o padrão comportamental <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter várias implementações dessa mesma
 * interface.
 * 
 * @author roadris
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}
