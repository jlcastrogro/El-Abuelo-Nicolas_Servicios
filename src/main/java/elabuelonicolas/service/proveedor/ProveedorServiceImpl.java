package elabuelonicolas.service.proveedor;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Proveedor;
import elabuelonicolas.dao.proveedor.ProveedorDao;

@Named
public class ProveedorServiceImpl implements ProveedorService {

	@Inject
	ProveedorDao proveedorDao;

	public List<Proveedor> findAll() {
		return proveedorDao.findAll();
	}

	public void create(Proveedor proveedor) {
		proveedorDao.create(proveedor);
	}

	public Proveedor read(int id) {
		return proveedorDao.read(id);
	}

	public List<Proveedor> readByNombre(String nombre) {
		return proveedorDao.readByNombre(nombre);
	}

	public Proveedor readByDireccion(int idDireccion) {
		return proveedorDao.readByDireccion(idDireccion);
	}

	public List<Proveedor> readByContacto(String contacto) {
		return proveedorDao.readByContacto(contacto);
	}

	public List<Proveedor> readByTelefono(String telefono) {
		return proveedorDao.readByTelefono(telefono);
	}

	public List<Proveedor> readByEmail(String email) {
		return proveedorDao.readByEmail(email);
	}

	public List<Proveedor> readByRfc(String rfc) {
		return proveedorDao.readByRfc(rfc);
	}

	public void update(Proveedor proveedor) {
		proveedorDao.update(proveedor);
	}
	
	public void updateNombre(@Param("id") int id, @Param("nombre") String nombre) {
		proveedorDao.updateNombre(id, nombre);
	}

	public void updateContacto(@Param("id") int id, @Param("contacto") String contacto) {
		proveedorDao.updateContacto(id, contacto);
	}

	public void updateTelefono(@Param("id") int id, @Param("telefono") String telefono) {
		proveedorDao.updateTelefono(id, telefono);
	}

	public void updateEmail(@Param("id") int id, @Param("email") String email) {
		proveedorDao.updateEmail(id, email);
	}

	public void updateRfc(@Param("id") int id, @Param("rfc") String rfc) {
		proveedorDao.updateRfc(id, rfc);
	}

	public void delete(int id) {
		proveedorDao.delete(id);
	}
	
	public Proveedor last() {
		return proveedorDao.last();
	}
}
