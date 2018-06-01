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

	@Override
	public List<Producto> readByTipo(String tipo) {
		return productoDao.readByTipo(tipo);
	}

	@Override
	public List<Producto> readByMarca(String marca) {
		return productoDao.readByMarca(marca);
	}

	@Override
	public List<Producto> readByCosto(Double costo) {
		return productoDao.readByCosto(costo);
	}
	
	@Override
	public List<Producto> readByExistencia(int existencia) {
		return productoDao.readByExistencia(existencia);
	}
	
	public void update(Producto producto) {
		productoDao.update(producto);
	}

	@Override
	public void updateTipo(int id, String tipo) {
		productoDao.updateTipo(id, tipo);
	}

	@Override
	public void updateMarca(int id, String marca) {
		productoDao.updateMarca(id, marca);
	}

	@Override
	public void updateCosto(int id, Double costo) {
		productoDao.updateCosto(id, costo);
	}

	@Override
	public void updateExistencia(int id, int existencia) {
		productoDao.updateExistencia(id, existencia);
	}
	
	public void delete(int id) {
		productoDao.delete(id);
	}

	@Override
	public Producto last() {
		return productoDao.last();
	}
}
