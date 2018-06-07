package elabuelonicolas.service.compra;
 
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Compra;

public interface CompraService {
	List<Compra> findAll();

	void create(Compra compra);

	Compra read(int id);
	
	List<Compra> readByIdProveedor(int idproveedor);
	
	List<Compra> readByFecha(Date fecha);
	
	List<Compra> readByTotal(Double total);
	
	void update(Compra compra);
	
	void updateIdProveedor(@Param("id") int id, @Param("idproveedor") int idproveedor);
	
	void updateFecha(@Param("id") int id, @Param("fecha") Date fecha);
	
	void updateTotal(@Param("id") int id, @Param("total") double total);

	void delete(int id);
	
	Compra last();
}
