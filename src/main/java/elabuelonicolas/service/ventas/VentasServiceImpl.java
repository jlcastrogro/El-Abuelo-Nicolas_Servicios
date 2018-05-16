package elabuelonicolas.service.ventas; 

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import elabuelonicolas.bd.domain.Ventas;
import elabuelonicolas.dao.ventas.VentasDao;

@Named
public class VentasServiceImpl implements VentasService{

	@Inject
	VentasDao ventasDao;
	
	public List<Ventas> findAll(){
		return ventasDao.findAll();
	}
	
	public void create(Ventas ventas) {
		ventasDao.create(ventas);
	}
	
	public Ventas read(int id) {
		return ventasDao.read(id);
	}
	
	public void update(Ventas ventas) {
		ventasDao.update(ventas);
	}
	
	public void delete(int id) {
		ventasDao.delete(id);
	}
}
