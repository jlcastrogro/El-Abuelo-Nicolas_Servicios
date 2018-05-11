package elabuelonicolas.service.producto;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import elabuelonicolas.bd.domain.Producto;
import elabuelonicolas.dao.producto.ProductoDao;

@Named
public class ProductoServiceImpl implements ProductoService {

	@Inject
	ProductoDao productoDao;

	public List<Producto> findAll() {
		return productoDao.findAll();
	}

	public void create(Producto producto) {
		productoDao.create(producto);
	}

	public Producto read(int id) {
		return productoDao.read(id);
	}

	public void update(Producto producto) {
		productoDao.update(producto);
	}

	public void delete(int id) {
		productoDao.delete(id);
	}
}
