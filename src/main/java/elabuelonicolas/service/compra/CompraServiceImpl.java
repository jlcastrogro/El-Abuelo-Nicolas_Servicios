package elabuelonicolas.service.compra;

import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import elabuelonicolas.bd.domain.Compra;
import elabuelonicolas.dao.compra.CompraDao;
 
@Named
public class CompraServiceImpl implements CompraService{	

		@Inject
		CompraDao compraDao; 

		public List<Compra> findAll() {
			return compraDao.findAll();
		}

		public void create(Compra compra) {
			compraDao.create(compra);
		}

		public Compra read(int id) {
			return compraDao.read(id);
		}

		public void update(Compra compra) {
			compraDao.update(compra);
		}

		public void delete(int id) {
			compraDao.delete(id);
		}
}
