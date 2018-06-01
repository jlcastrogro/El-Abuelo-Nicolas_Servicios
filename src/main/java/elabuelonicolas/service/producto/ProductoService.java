package elabuelonicolas.service.producto;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Producto;

public interface ProductoService {
	List<Producto> findAll();

	void create(Producto producto);

	Producto read(int id);
	
	List<Producto> readByTipo(String tipo);
	
	List<Producto> readByMarca(String marca);
	
	List<Producto> readByCosto(Double costo);
	
	List<Producto> readByExistencia(int existencia);

	void update(Producto producto);

	void updateTipo(@Param("id") int id, @Param("tipo") String tipo);
	
	void updateMarca(@Param("id") int id, @Param("marca") String marca);
	
	void updateCosto(@Param("id") int id, @Param("costo") Double costo);
	
	void updateExistencia(@Param("id") int id, @Param("existencia") int existencia);
	
	void delete(int id);
	
	Producto last();
}