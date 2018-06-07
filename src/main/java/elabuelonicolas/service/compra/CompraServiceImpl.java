package elabuelonicolas.service.compra;

import java.sql.Date;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import elabuelonicolas.bd.domain.Compra;
import elabuelonicolas.dao.compra.CompraDao;

@Named
public class CompraServiceImpl implements CompraService {

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

	@Override
	public List<Compra> readByIdProveedor(int idproveedor) {
		return compraDao.readByIdProveedor(idproveedor);
	}

	@Override
	public List<Compra> readByFecha(Date fecha) {
		return compraDao.readByFecha(fecha);
	}

	@Override
	public List<Compra> readByTotal(Double total) {
		return compraDao.readByTotal(total);
	}

	public void update(Compra compra) {
		compraDao.update(compra);
	}

	@Override
	public void updateIdProveedor(int id, int idproveedor) {
		compraDao.updateIdProveedor(id, idproveedor);
	}

	@Override
	public void updateFecha(int id, Date fecha) {
		compraDao.updateFecha(id, fecha);
	}

	@Override
	public void updateTotal(int id, double total) {
		compraDao.updateTotal(id, total);
	}

	public void delete(int id) {
		compraDao.delete(id);
	}

	@Override
	public Compra last() {
		return compraDao.last();
	}
}
