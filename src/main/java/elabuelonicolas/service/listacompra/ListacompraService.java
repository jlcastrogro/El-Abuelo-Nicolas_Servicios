package elabuelonicolas.service.listacompra;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import elabuelonicolas.bd.domain.Listacompra;
 
public interface ListacompraService {
	List<Listacompra> findAll();

	void create(Listacompra listacompra);

	Listacompra read(int id);

	List<Listacompra> readByIdCompra(int idcompra);

	List<Listacompra> readByIdProducto(int idproducto);

	List<Listacompra> readByCantidad(int cantidad);

	List<Listacompra> readBySubtotal(double subtotal);

	void update(Listacompra listacompra);

	void updateIdCompra(@Param("id") int id, @Param("idcompra") int idcompra);

	void updateIdProducto(@Param("id") int id, @Param("idproducto") int idproducto);

	void updateCantidad(@Param("id") int id, @Param("cantidad") int cantidad);

	void updateSubtotal(@Param("id") int id, @Param("subtotal") double subtotal);

	void delete(int id);

	Listacompra last();
}
