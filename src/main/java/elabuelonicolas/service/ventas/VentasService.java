package elabuelonicolas.service.ventas;

import java.util.List;

import elabuelonicolas.bd.domain.Ventas;

public interface VentasService {

	List<Ventas> findAll();
	
	void create(Ventas ventas);
	
	Ventas read(int id);
	
	void update(Ventas ventas);
	
	void delete(int id);
}
