package elabuelonicolas.service.producto;

import java.util.List;
import elabuelonicolas.bd.domain.Producto;

public interface ProductoService {
	List<Producto> findAll();

	void create(Producto producto);

	Producto read(int id);

	void update(Producto producto);

	void delete(int id);
}