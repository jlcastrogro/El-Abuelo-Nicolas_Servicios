package elabuelonicolas.service.venta; 

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Venta;

public interface VentaService {

	List<Venta> findAll();

	void create(Venta venta);

	Venta read(int id);

	List<Venta> readByIdCliente(int idcliente);

	List<Venta> readByFecha(Date fecha);

	List<Venta> readByFechas(@Param("fechainicio") Date fechainicio, @Param("fechafin") Date fechafin);

	List<Venta> readByTotal(Double total);

	List<Venta> readByTotalReal(Double totalreal);

	List<Venta> readByGanancia(Double ganancia);

	void update(Venta venta);

	void updateIdCliente(@Param("id") int id, @Param("idcliente") int idcliente);

	void updateFecha(@Param("id") int id, @Param("fecha") Date fecha);

	void updateTotal(@Param("id") int id, @Param("total") Double total);

	void updateTotalReal(@Param("id") int id, @Param("totalreal") Double totalreal);

	void updateGanancia(@Param("id") int id, @Param("ganancia") Double ganancia);

	void delete(int id);

	Venta last();
}
