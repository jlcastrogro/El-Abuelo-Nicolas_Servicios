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
	public List<Venta> readByIdCliente(int idcliente) {
		return ventaDao.readByIdCliente(idcliente);
	}

	@Override
	public List<Venta> readByFecha(Date fecha) {
		return ventaDao.readByFecha(fecha);
	}

	@Override
	public List<Venta> readByFechas(Date fechainicio, Date fechafin) {
		return ventaDao.readByFechas(fechainicio, fechafin);
	}
	
	@Override
	public List<Venta> readByTotal(Double total) {
		return ventaDao.readByTotal(total);
	}

	@Override
	public List<Venta> readByTotalReal(Double totalreal) {
		return ventaDao.readByTotalReal(totalreal);
	}

	@Override
	public List<Venta> readByGanancia(Double ganancia) {
		return ventaDao.readByGanancia(ganancia);
	}
	
	public void update(Venta ventas) {
		ventaDao.update(ventas);
	}
	
	@Override
	public void updateIdCliente(int id, int idcliente) {
		ventaDao.updateIdCliente(id, idcliente);
	}

	@Override
	public void updateFecha(int id, Date fecha) {
		ventaDao.updateFecha(id, fecha);
	}

	@Override
	public void updateTotal(int id, Double total) {
		ventaDao.updateTotal(id, total);
	}
	
	@Override
	public void updateTotalReal(int id, Double totalreal) {
		ventaDao.updateTotalReal(id, totalreal);
	}

	@Override
	public void updateGanancia(int id, Double ganancia) {
		ventaDao.updateGanancia(id, ganancia);
	}
	
	public void delete(int id) {
		ventaDao.delete(id);
	}

	@Override
	public Venta last() {
		return ventaDao.last();
	}
}
