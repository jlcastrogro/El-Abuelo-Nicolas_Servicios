package elabuelonicolas.service.proveedor;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Proveedor;

public interface ProveedorService {
	List<Proveedor> findAll();

	void create(Proveedor proveedor);

	Proveedor read(int id);
	
	List<Proveedor> readByNombre(String nombre);

	Proveedor readByDireccion(int idDireccion);

	List<Proveedor> readByContacto(String nombre);

	List<Proveedor> readByTelefono(String telefono);

	List<Proveedor> readByEmail(String email);

	List<Proveedor> readByRfc(String rfc);

	void update(Proveedor proveedor);
	
	void updateNombre(@Param("id") int id, @Param("nombre") String nombre);

	void updateContacto(@Param("id") int id, @Param("contacto") String contacto);

	void updateTelefono(@Param("id") int id, @Param("telefono") String telefono);

	void updateEmail(@Param("id") int id, @Param("email") String email);

	void updateRfc(@Param("id") int id, @Param("rfc") String rfc);

	void delete(int id);
	
	Proveedor last();
}