package elabuelonicolas.service.listaventa;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listaventa;
import elabuelonicolas.dao.listaventa.ListaventaDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	ListaventaDao listaventaDao;

	@Test
	public void read() {
		try {
			Listaventa venta = listaventaDao.read(1);
			assertEquals(venta.getId(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByIdVenta() {
		try {
			List<Listaventa> listaventa = listaventaDao.readByIdVenta(1);
			assertEquals(listaventa.get(0).getIdventa(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readByIdVentaTest: " + e);
		}
	}
	
	@Test
	public void readByProducto() {
		try {
			List<Listaventa> listaventa = listaventaDao.readByIdProducto(1);
			assertEquals(listaventa.get(0).getIdventa(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readByProductoTest: " + e);
		}
	}
	
	@Test
	public void readByCantidad() {
		try {
			List<Listaventa> listaventa = listaventaDao.readByCantidad(1);
			assertEquals(listaventa.get(0).getCantidad(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readByCantidadTest: " + e);
		}
	}
	
	@Test
	public void readBySubtotal() {
		try {
			List<Listaventa> listaventa = listaventaDao.readBySubtotal(1553.5);
			assertEquals(listaventa.get(0).getSubtotal(), 1553.5, 1);
		} catch (Exception e) {
			System.out.println("Error readBySubtotalTest: " + e);
		}
	}
}
