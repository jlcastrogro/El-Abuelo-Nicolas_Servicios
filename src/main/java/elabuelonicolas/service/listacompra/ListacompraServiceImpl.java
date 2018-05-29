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

	public void update(Listacompra compra) {
		listacompraDao.update(compra);
	}

	public void delete(int id) {
		listacompraDao.delete(id);
	}
	
}
