package elabuelonicolas.service.listacompras; 

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import elabuelonicolas.bd.domain.Listacompras;
import elabuelonicolas.dao.listacompras.ListacomprasDao;

@Named

public class ListacomprasServiceImpl implements ListacomprasService{
	@Inject
	ListacomprasDao lcDao;

	public List<Listacompras> findAll() {
		return lcDao.findAll();
	}

	public void create(Listacompras lc) {
		lcDao.create(lc);
	}

	public Listacompras read(int id) {
		return lcDao.read(id);
	}

	public void update(Listacompras compra) {
		lcDao.update(compra);
	}

	public void delete(int id) {
		lcDao.delete(id);
	}
	
}
