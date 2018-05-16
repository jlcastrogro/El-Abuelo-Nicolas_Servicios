package elabuelonicolas.service.compras;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import elabuelonicolas.bd.domain.Compras;
import elabuelonicolas.dao.compras.ComprasDao;
 
@Named
public class ComprasServiceImpl implements ComprasService{	

		@Inject
		ComprasDao compraDao;

		public List<Compras> findAll() {
			return compraDao.findAll();
		}

		public void create(Compras compra) {
			compraDao.create(compra);
		}

		public Compras read(int id) {
			return compraDao.read(id);
		}

		public void update(Compras compra) {
			compraDao.update(compra);
		}

		public void delete(int id) {
			compraDao.delete(id);
		}
}
