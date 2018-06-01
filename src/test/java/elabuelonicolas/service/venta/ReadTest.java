package elabuelonicolas.service.venta;

import static org.junit.Assert.assertEquals;
import java.sql.Date;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Venta;
import elabuelonicolas.dao.venta.VentaDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	VentaDao ventaDao;

	@Test
	public void read() {
		try {
			Venta c = ventaDao.read(1);
			assertEquals(c.getId(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByIdCliente() {
		try {
			List<Venta> ventas = ventaDao.readByIdCliente(1);
			assertEquals(ventas.get(0).getIdcliente(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readByIdClienteTest: " + e);
		}
	}

	@Test
	public void readByFecha() {
		try {
			List<Venta> ventas = ventaDao.readByFecha(Date.valueOf("2018-5-1"));
			assertEquals(ventas.get(0).getFecha(), Date.valueOf("2018-5-1"));
		} catch (Exception e) {
			System.out.println("Error readByFechaTest: " + e);
		}
	}

	@Test
	public void readByFechas() {
		try {
			List<Venta> ventas = ventaDao.readByFechas(Date.valueOf("2018-5-1"), Date.valueOf("2018-5-2"));
			assertEquals(ventas.get(0).getFecha(), Date.valueOf("2018-5-1"));
		} catch (Exception e) {
			System.out.println("Error readByFechasTest: " + e);
		}
	}
}
