package elabuelonicolas.service.cliente;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Cliente;

public interface ClienteService {
	List<Cliente> findAll();

	void create(Cliente cliente);

	Cliente read(int id);

	List<Cliente> readByNombre(String nombre);

	Cliente readByDireccion(int idDireccion);

	List<Cliente> readByContacto(String nombre);

	List<Cliente> readByTelefono(String telefono);

	List<Cliente> readByEmail(String email);

	List<Cliente> readByRfc(String rfc);

	void update(Cliente cliente);

	void updateNombre(@Param("id") int id, @Param("nombre") String nombre);

	void updateContacto(@Param("id") int id, @Param("contacto") String contacto);

	void updateTelefono(@Param("id") int id, @Param("telefono") String telefono);

	void updateEmail(@Param("id") int id, @Param("email") String email);

	void updateRfc(@Param("id") int id, @Param("rfc") String rfc);

	void delete(int id);
	
	Cliente last();
}