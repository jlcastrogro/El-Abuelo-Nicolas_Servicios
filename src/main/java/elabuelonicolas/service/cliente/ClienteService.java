package elabuelonicolas.service.cliente;

import java.util.List;
import elabuelonicolas.bd.domain.Cliente;

public interface ClienteService {
	List<Cliente> findAll();

	void create(Cliente cliente);

	Cliente readById(int id);

	void update(Cliente cliente);

	void delete(int id);
}