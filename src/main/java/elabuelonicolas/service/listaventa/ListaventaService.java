package elabuelonicolas.service.listaventa; 

import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Listaventa;

public interface ListaventaService {

	List<Listaventa> findAll();

	void create(Listaventa listaventa);

	Listaventa read(int id);

	List<Listaventa> readByIdVenta(int idventa);

	List<Listaventa> readByIdProducto(int idproducto);

	List<Listaventa> readByCantidad(int cantidad);

	List<Listaventa> readBySubtotal(double subtotal);

	List<Listaventa> readBySubtotalReal(double subtotalreal);

	List<Listaventa> readByGanancia(double ganancia);

	void update(Listaventa listaventa);

	void updateIdVenta(@Param("id") int id, @Param("idventa") int idventa);

	void updateIdProducto(@Param("id") int id, @Param("idproducto") int idproducto);

	void updateCantidad(@Param("id") int id, @Param("cantidad") int cantidad);

	void updateSubtotal(@Param("id") int id, @Param("subtotal") double subtotal);

	void updateSubtotalReal(@Param("id") int id, @Param("subtotalreal") double subtotalreal);

	void updateGanancia(@Param("id") int id, @Param("ganancia") double ganancia);

	void delete(int id);

	Listaventa last();
	
	List<Listaventa> best();
}