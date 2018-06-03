package elabuelonicolas.service.direccion;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import elabuelonicolas.bd.domain.Direccion;

public interface DireccionService {

	List<Direccion> findAll();

	void create(Direccion direccion);

	Direccion read(int id);
	
	List<Direccion> readByPais(String pais);
	
	List<Direccion> readByEstado(String estado);
	
	List<Direccion> readByCiudad(String ciudad);
	
	List<Direccion> readByColonia(String colonia);
	
	List<Direccion> readByCalle(String calle);
	
	Direccion readByNumero(int numero);
	
	void update(Direccion direccion);
	
	void updatePais(@Param("id") int id, @Param("pais") String pais);
	
	void updateEstado(@Param("id") int id, @Param("pais") String estado);
	
	void updateCiudad(@Param("id") int id, @Param("pais") String ciudad);
	
	void updateColonia(@Param("id") int id, @Param("pais") String colonia);
	
	void updateCalle(@Param("id") int id, @Param("pais") String calle);
	
	void updateNumero(@Param("id") int id, @Param("pais") int numero );
	
	void delete(int id);
	
	Direccion last();
}
