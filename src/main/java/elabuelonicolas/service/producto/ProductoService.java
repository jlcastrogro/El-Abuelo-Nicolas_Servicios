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
	
	List<Producto> readByCostoCompra(Double costocompra);
	
	List<Producto> readByCostoVenta(Double costoventa);
	
	List<Producto> readByExistencia(int existencia);
	
	List<Producto> readByStatus(int status);

	void update(Producto producto);

	void updateTipo(@Param("id") int id, @Param("tipo") String tipo);
	
	void updateMarca(@Param("id") int id, @Param("marca") String marca);
	
	void updateCostoCompra(@Param("id") int id, @Param("costocompra") Double costocompra);
	
	void updateCostoVenta(@Param("id") int id, @Param("costoventa") Double costoventa);
	
	void updateExistencia(@Param("id") int id, @Param("existencia") int existencia);
	
	void updateStatus(@Param("id") int id, @Param("status") int status);
	
	void delete(int id);
	
	Producto last();
}