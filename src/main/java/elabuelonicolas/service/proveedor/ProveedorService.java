package elabuelonicolas.service.proveedor;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Proveedor;

public interface ProveedorService {
List<Proveedor> findAll();
	
	void create(Proveedor proveedor);

	Proveedor read(int id);

	List<Proveedor> readByNombre(String nombre);

	List<Proveedor> readByContacto(String contacto);

	Proveedor readByTelefono(String telefono);

	Proveedor readByEmail(String email);

	Proveedor readByRfc(String rfc);
	
	List<Proveedor> readByEstado(String estado);

	List<Proveedor> readByMunicipio(String municipio);

	List<Proveedor> readByLocalidad(String localidad);

	List<Proveedor> readByCodigoPostal(String codigopostal);

	List<Proveedor> readByAsentamiento(String asentamiento);
	
	List<Proveedor> readByCalle(String calle);

	List<Proveedor> readByNumero(String numero);

	List<Proveedor> readByStatus(String status);

	void update(Proveedor proveedor);

	void updateNombre(@Param("id") int id, @Param("nombre") String nombre);

	void updateContacto(@Param("id") int id, @Param("contacto") String contacto);

	void updateTelefono(@Param("id") int id, @Param("telefono") String telefono);

	void updateEmail(@Param("id") int id, @Param("email") String email);

	void updateRfc(@Param("id") int id, @Param("rfc") String rfc);
	
	void updateEstado(@Param("id") int id, @Param("estado") String estado);

	void updateMunicipio(@Param("id") int id, @Param("municipio") String municipio);

	void updateLocalidad(@Param("id") int id, @Param("localidad") String localidad);

	void updateCodigoPostal(@Param("id") int id, @Param("codigopostal") String codigopostal);

	void updateAsentamiento(@Param("id") int id, @Param("asentamiento") String asentamiento);
	
	void updateCalle(@Param("id") int id, @Param("calle") String calle);

	void updateNumero(@Param("id") int id, @Param("numero") String numero);

	void updateStatus(@Param("id") int id, @Param("status") String status);

	void delete(int id);

	Proveedor last();
}