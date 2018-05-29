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
	
	public void update(Listaventa listaventas) {
		listaventaDao.update(listaventas);
	}
	
	public void delete(int id) {
		listaventaDao.delete(id);
	}
}
