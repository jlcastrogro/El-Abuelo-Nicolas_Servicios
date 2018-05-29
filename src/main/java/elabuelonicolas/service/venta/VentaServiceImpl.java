package elabuelonicolas.service.venta; 

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import elabuelonicolas.bd.domain.Venta;
import elabuelonicolas.dao.venta.VentaDao;

@Named
public class VentaServiceImpl implements VentaService{

	@Inject
	VentaDao ventaDao;
	
	public List<Venta> findAll(){
		return ventaDao.findAll();
	}
	
	public void create(Venta ventas) {
		ventaDao.create(ventas);
	}
	
	public Venta read(int id) {
		return ventaDao.read(id);
	}
	
	public void update(Venta ventas) {
		ventaDao.update(ventas);
	}
	
	public void delete(int id) {
		ventaDao.delete(id);
	}
}
