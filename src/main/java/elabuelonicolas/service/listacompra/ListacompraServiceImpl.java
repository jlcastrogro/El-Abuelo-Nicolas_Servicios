package elabuelonicolas.service.listacompra; 

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import elabuelonicolas.bd.domain.Listacompra;
import elabuelonicolas.dao.listacompra.ListacompraDao;

@Named

public class ListacompraServiceImpl implements ListacompraService{
	@Inject
	ListacompraDao listacompraDao;
 
	public List<Listacompra> findAll() {
		return listacompraDao.findAll();
	}

	public void create(Listacompra lc) {
		listacompraDao.create(lc);
	}

	public Listacompra read(int id) {
		return listacompraDao.read(id);
	}

	@Override
	public List<Listacompra> readByIdCompra(int idcompra) {
		return listacompraDao.readByIdCompra(idcompra);
	}

	@Override
	public List<Listacompra> readByIdProducto(int idproducto) {
		return listacompraDao.readByIdProducto(idproducto);
	}

	@Override
	public List<Listacompra> readByCantidad(int cantidad) {
		return listacompraDao.readByCantidad(cantidad);
	}

	@Override
	public List<Listacompra> readBySubtotal(double subtotal) {
		return listacompraDao.readBySubtotal(subtotal);
	}
	
	public void update(Listacompra compra) {
		listacompraDao.update(compra);
	}

	@Override
	public void updateIdCompra(int id, int idcompra) {
		listacompraDao.updateIdProducto(id, idcompra);
	}

	@Override
	public void updateIdProducto(int id, int idproducto) {
		listacompraDao.updateIdProducto(id, idproducto);
	}

	@Override
	public void updateCantidad(int id, int cantidad) {
		listacompraDao.updateCantidad(id, cantidad);
	}

	@Override
	public void updateSubtotal(int id, double subtotal) {
		listacompraDao.updateSubtotal(id, subtotal);
	}
	
	public void delete(int id) {
		listacompraDao.delete(id);
	}

	@Override
	public Listacompra last() {
		return listacompraDao.last();
	}
	
}
