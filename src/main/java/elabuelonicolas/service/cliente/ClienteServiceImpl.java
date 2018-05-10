package elabuelonicolas.service.cliente;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import elabuelonicolas.bd.domain.Cliente;
import elabuelonicolas.dao.cliente.ClienteDao;

@Named
public class ClienteServiceImpl implements ClienteService {

	@Inject
	ClienteDao clienteDao;

	public List<Cliente> findAll() {
		return clienteDao.findAll();
	}

	public void create(Cliente cliente) {
		clienteDao.create(cliente);
	}

	public Cliente read(int id) {
		return clienteDao.read(id);
	}

	public void update(Cliente cliente) {
		clienteDao.update(cliente);
	}

	public void delete(int id) {
		clienteDao.delete(id);
	}
}
