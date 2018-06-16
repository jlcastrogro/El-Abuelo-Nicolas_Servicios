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

	public List<Proveedor> readByContacto(String contacto) {
		return proveedorDao.readByContacto(contacto);
	}

	@Override
	public Proveedor readByTelefono(String telefono) {
		return proveedorDao.readByTelefono(telefono);
	}

	@Override
	public Proveedor readByEmail(String email) {
		return proveedorDao.readByEmail(email);
	}

	@Override
	public Proveedor readByRfc(String rfc) {
		return proveedorDao.readByRfc(rfc);
	}

	@Override
	public List<Proveedor> readByEstado(String estado) {
		return proveedorDao.readByEstado(estado);
	}

	@Override
	public List<Proveedor> readByMunicipio(String municipio) {
		return proveedorDao.readByMunicipio(municipio);
	}

	@Override
	public List<Proveedor> readByLocalidad(String localidad) {
		return proveedorDao.readByLocalidad(localidad);
	}

	@Override
	public List<Proveedor> readByCodigoPostal(String codigopostal) {
		return proveedorDao.readByCodigoPostal(codigopostal);
	}

	@Override
	public List<Proveedor> readByAsentamiento(String asentamiento) {
		return proveedorDao.readByAsentamiento(asentamiento);
	}

	@Override
	public List<Proveedor> readByCalle(String calle) {
		return proveedorDao.readByCalle(calle);
	}

	@Override
	public List<Proveedor> readByNumero(String numero) {
		return proveedorDao.readByNumero(numero);
	}

	@Override
	public List<Proveedor> readByStatus(String status) {
		return proveedorDao.readByStatus(status);
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
	
	@Override
	public void updateEstado(int id, String estado) {
		proveedorDao.updateEstado(id, estado);
	}

	@Override
	public void updateMunicipio(int id, String municipio) {
		proveedorDao.updateMunicipio(id, municipio);
	}

	@Override
	public void updateLocalidad(int id, String localidad) {
		proveedorDao.updateLocalidad(id, localidad);
	}

	@Override
	public void updateCodigoPostal(int id, String codigopostal) {
		proveedorDao.updateCodigoPostal(id, codigopostal);
	}

	@Override
	public void updateAsentamiento(int id, String asentamiento) {
		proveedorDao.updateAsentamiento(id, asentamiento);
	}

	@Override
	public void updateCalle(int id, String calle) {
		proveedorDao.updateCalle(id, calle);
	}

	@Override
	public void updateNumero(int id, String numero) {
		proveedorDao.updateNumero(id, numero);
	}

	@Override
	public void updateStatus(int id, String status) {
		proveedorDao.updateStatus(id, status);
	}

	public void delete(int id) {
		proveedorDao.delete(id);
	}
	
	public Proveedor last() {
		return proveedorDao.last();
	}
}
