package elabuelonicolas.service.venta; 

import java.util.List;

import elabuelonicolas.bd.domain.Venta;

public interface VentaService {

	List<Venta> findAll();
	
	void create(Venta ventas);
	
	Venta read(int id);
	
	void update(Venta ventas);
	
	void delete(int id);
}
