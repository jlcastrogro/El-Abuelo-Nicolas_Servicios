package elabuelonicolas.service.cliente;

import java.util.List;
import elabuelonicolas.bd.domain.Cliente;

public interface ClienteService {
	List<Cliente> findAll();

	void create(Cliente cliente);

	Cliente read(int id);

	void update(Cliente cliente);

	void delete(int id);
}