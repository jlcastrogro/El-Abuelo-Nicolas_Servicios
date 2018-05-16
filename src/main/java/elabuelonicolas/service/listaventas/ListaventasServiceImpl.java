package elabuelonicolas.service.listaventas;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import elabuelonicolas.bd.domain.Listaventas;
import elabuelonicolas.dao.listaventas.ListaventasDao;

@Named
public class ListaventasServiceImpl implements ListaventasService{
	
	@Inject
	ListaventasDao listaventasDao;
	
	public List<Listaventas> findAll(){
		return listaventasDao.findAll();
	}
	
	public void create(Listaventas listaventas) {
		listaventasDao.create(listaventas);
	}
	
	public Listaventas read(int id) {
		return listaventasDao.read(id);
	}
	
	public void update(Listaventas listaventas) {
		listaventasDao.update(listaventas);
	}
	
	public void delete(int id) {
		listaventasDao.delete(id);
	}
}
