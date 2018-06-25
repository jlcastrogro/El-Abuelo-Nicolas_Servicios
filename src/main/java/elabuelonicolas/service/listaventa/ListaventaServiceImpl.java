package elabuelonicolas.service.listaventa; 

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import elabuelonicolas.bd.domain.Listaventa;
import elabuelonicolas.dao.listaventa.ListaventaDao;

@Named
public class ListaventaServiceImpl implements ListaventaService{
	
	@Inject
	ListaventaDao listaventaDao;
	
	public List<Listaventa> findAll(){
		return listaventaDao.findAll();
	}
	
	public void create(Listaventa listaventas) {
		listaventaDao.create(listaventas);
	}
	
	public Listaventa read(int id) {
		return listaventaDao.read(id);
	}
	
	@Override
	public List<Listaventa> readByIdVenta(int idventa) {
		return listaventaDao.readByIdVenta(idventa);
	}

	@Override
	public List<Listaventa> readByIdProducto(int idproducto) {
		return listaventaDao.readByIdProducto(idproducto);
	}

	@Override
	public List<Listaventa> readByCantidad(int cantidad) {
		return listaventaDao.readByCantidad(cantidad);
	}

	@Override
	public List<Listaventa> readBySubtotal(double subtotal) {
		return listaventaDao.readBySubtotal(subtotal);
	}
	
	@Override
	public List<Listaventa> readBySubtotalReal(double subtotalreal) {
		return listaventaDao.readBySubtotalReal(subtotalreal);
	}

	@Override
	public List<Listaventa> readByGanancia(double ganancia) {
		return listaventaDao.readByGanancia(ganancia);
	}
	
	public void update(Listaventa listaventas) {
		listaventaDao.update(listaventas);
	}
	
	@Override
	public void updateIdVenta(int id, int idventa) {
		listaventaDao.updateIdVenta(id, idventa);
	}

	@Override
	public void updateIdProducto(int id, int idproducto) {
		listaventaDao.updateIdProducto(id, idproducto);
	}

	@Override
	public void updateCantidad(int id, int cantidad) {
		listaventaDao.updateCantidad(id, cantidad);
	}

	@Override
	public void updateSubtotal(int id, double subtotal) {
		listaventaDao.updateSubtotal(id, subtotal);
	}
	
	@Override
	public void updateSubtotalReal(int id, double subtotalreal) {
		listaventaDao.updateSubtotalReal(id, subtotalreal);
	}

	@Override
	public void updateGanancia(int id, double ganancia) {
		listaventaDao.updateGanancia(id, ganancia);
	}
	
	public void delete(int id) {
		listaventaDao.delete(id);
	}

	@Override
	public Listaventa last() {
		return listaventaDao.last();
	}
	
	public List<Listaventa> best(){
		return listaventaDao.best();
	}
}
