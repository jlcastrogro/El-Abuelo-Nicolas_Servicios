package elabuelonicolas.service.cliente;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Cliente;

public interface ClienteService {
	List<Cliente> findAll();

	void create(Cliente cliente);

	Cliente read(int id);

	List<Cliente> readByNombre(String nombre);

	List<Cliente> readByContacto(String contacto);

	Cliente readByTelefono(String telefono);

	Cliente readByEmail(String email);

	Cliente readByRfc(String rfc);

	List<Cliente> readByEstado(String estado);

	List<Cliente> readByMunicipio(String municipio);

	List<Cliente> readByLocalidad(String localidad);

	List<Cliente> readByCodigoPostal(String codigopostal);

	List<Cliente> readByAsentamiento(String asentamiento);

	List<Cliente> readByCalle(String calle);

	List<Cliente> readByNumero(String numero);

	List<Cliente> readByStatus(String status);

	void update(Cliente cliente);

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

	Cliente last();
}