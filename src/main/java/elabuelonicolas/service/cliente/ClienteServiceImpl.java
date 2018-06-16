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

	public List<Cliente> readByContacto(String contacto) {
		return clienteDao.readByContacto(contacto);
	}

	public Cliente readByTelefono(String telefono) {
		return clienteDao.readByTelefono(telefono);
	}

	public Cliente readByEmail(String email) {
		return clienteDao.readByEmail(email);
	}

	public Cliente readByRfc(String rfc) {
		return clienteDao.readByRfc(rfc);
	}

	@Override
	public List<Cliente> readByEstado(String estado) {
		return clienteDao.readByEstado(estado);
	}

	@Override
	public List<Cliente> readByMunicipio(String municipio) {
		return clienteDao.readByMunicipio(municipio);
	}

	@Override
	public List<Cliente> readByLocalidad(String localidad) {
		return clienteDao.readByLocalidad(localidad);
	}

	@Override
	public List<Cliente> readByCodigoPostal(String codigopostal) {
		return clienteDao.readByCodigoPostal(codigopostal);
	}

	@Override
	public List<Cliente> readByAsentamiento(String asentamiento) {
		return clienteDao.readByAsentamiento(asentamiento);
	}

	@Override
	public List<Cliente> readByCalle(String calle) {
		return clienteDao.readByCalle(calle);
	}

	@Override
	public List<Cliente> readByNumero(String numero) {
		return clienteDao.readByNumero(numero);
	}

	@Override
	public List<Cliente> readByStatus(String status) {
		return clienteDao.readByStatus(status);
	}
	
	public void update(Cliente cliente) {
		clienteDao.update(cliente);
	}
	
	public void updateNombre(@Param("id") int id, @Param("nombre") String nombre) {
		clienteDao.updateNombre(id, nombre);
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
	
	@Override
	public void updateEstado(int id, String estado) {
		clienteDao.updateEstado(id, estado);
	}

	@Override
	public void updateMunicipio(int id, String municipio) {
		clienteDao.updateMunicipio(id, municipio);
	}

	@Override
	public void updateLocalidad(int id, String localidad) {
		clienteDao.updateLocalidad(id, localidad);
	}

	@Override
	public void updateCodigoPostal(int id, String codigopostal) {
		clienteDao.updateCodigoPostal(id, codigopostal);
	}

	@Override
	public void updateAsentamiento(int id, String asentamiento) {
		clienteDao.updateAsentamiento(id, asentamiento);
	}

	@Override
	public void updateCalle(int id, String calle) {
		clienteDao.updateCalle(id, calle);
	}

	@Override
	public void updateNumero(int id, String numero) {
		clienteDao.updateNumero(id, numero);
	}

	@Override
	public void updateStatus(int id, String status) {
		clienteDao.updateStatus(id, status);
	}

	public void delete(int id) {
		clienteDao.delete(id);
	}
	
	public Cliente last() {
		return clienteDao.last();
	}
}
