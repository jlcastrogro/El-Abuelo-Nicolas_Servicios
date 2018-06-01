package elabuelonicolas.service.venta; 

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Venta;

public interface VentaService {

	List<Venta> findAll();

	void create(Venta venta);

	Venta read(int id);

	List<Venta> readByIdCliente(int idCliente);

	List<Venta> readByFecha(Date fecha);

	List<Venta> readByFechas(@Param("fechaInicio") Date fechaInicio, @Param("fechaFin") Date fechaFin);

	void update(Venta venta);

	void updateIdCliente(@Param("id") int id, @Param("idCliente") int idCliente);

	void updateFecha(@Param("id") int id, @Param("fecha") Date fecha);

	void updateTotal(@Param("id") int id, @Param("total") Double total);

	void delete(int id);
	
	Venta last();
}
