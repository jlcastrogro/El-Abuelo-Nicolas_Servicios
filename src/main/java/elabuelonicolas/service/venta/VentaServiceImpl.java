package elabuelonicolas.service.venta; 

import java.sql.Date;
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
	
	@Override
	public List<Venta> readByIdCliente(int idCliente) {
		return ventaDao.readByIdCliente(idCliente);
	}

	@Override
	public List<Venta> readByFecha(Date fecha) {
		return ventaDao.readByFecha(fecha);
	}

	@Override
	public List<Venta> readByFechas(Date fechaInicio, Date fechaFin) {
		return ventaDao.readByFechas(fechaInicio, fechaFin);
	}
	
	public void update(Venta ventas) {
		ventaDao.update(ventas);
	}
	
	@Override
	public void updateIdCliente(int id, int idCliente) {
		ventaDao.updateIdCliente(id, idCliente);
	}

	@Override
	public void updateFecha(int id, Date fecha) {
		ventaDao.updateFecha(id, fecha);
	}

	@Override
	public void updateTotal(int id, Double total) {
		ventaDao.updateTotal(id, total);
	}
	
	public void delete(int id) {
		ventaDao.delete(id);
	}

	@Override
	public Venta last() {
		return ventaDao.last();
	}
}
