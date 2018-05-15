package elabuelonicolas.service.cliente;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.ibatis.annotations.Param;

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

	public List<Cliente> readByNombre(String nombre) {
		return clienteDao.readByNombre(nombre);
	}

	public List<Cliente> readByDireccion(String direccion) {
		return clienteDao.readByDireccion(direccion);
	}

	public List<Cliente> readByContacto(String contacto) {
		return clienteDao.readByContacto(contacto);
	}

	public List<Cliente> readByTelefono(String telefono) {
		return clienteDao.readByTelefono(telefono);
	}

	public List<Cliente> readByEmail(String email) {
		return clienteDao.readByEmail(email);
	}

	public List<Cliente> readByRfc(String rfc) {
		return clienteDao.readByRfc(rfc);
	}

	public void update(Cliente cliente) {
		clienteDao.update(cliente);
	}
	
	public void updateNombre(@Param("id") int id, @Param("nombre") String nombre) {
		clienteDao.updateNombre(id, nombre);
	}

	public void updateDireccion(@Param("id") int id, @Param("direccion") String direccion) {
		clienteDao.updateDireccion(id, direccion);
	}

	public void updateContacto(@Param("id") int id, @Param("contacto") String contacto) {
		clienteDao.updateContacto(id, contacto);
	}

	public void updateTelefono(@Param("id") int id, @Param("telefono") String telefono) {
		clienteDao.updateTelefono(id, telefono);
	}

	public void updateEmail(@Param("id") int id, @Param("email") String email) {
		clienteDao.updateEmail(id, email);
	}

	public void updateRfc(@Param("id") int id, @Param("rfc") String rfc) {
		clienteDao.updateRfc(id, rfc);
	}

	public void delete(int id) {
		clienteDao.delete(id);
	}
	
	public Cliente last() {
		return clienteDao.last();
	}
}
