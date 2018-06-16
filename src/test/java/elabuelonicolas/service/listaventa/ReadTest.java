package elabuelonicolas.service.listaventa;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listaventa;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	ListaventaService listaventaService;

	@Test
	public void read() {
		try {
			Listaventa venta = listaventaService.read(1);
			assertEquals(venta.getId(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readListaventaTest: " + e);
		}
	}

	@Test
	public void readByIdVenta() {
		try {
			List<Listaventa> listaventa = listaventaService.readByIdVenta(1);
			assertEquals(listaventa.get(0).getIdventa(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readListaventaByIdVentaTest: " + e);
		}
	}
	
	@Test
	public void readByProducto() {
		try {
			List<Listaventa> listaventa = listaventaService.readByIdProducto(1);
			assertEquals(listaventa.get(0).getIdventa(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readListaventaByProductoTest: " + e);
		}
	}
	
	@Test
	public void readByCantidad() {
		try {
			List<Listaventa> listaventa = listaventaService.readByCantidad(2);
			assertEquals(listaventa.get(0).getCantidad(), 2, 1);
		} catch (Exception e) {
			System.out.println("Error readListaventaByCantidadTest: " + e);
		}
	}
	
	@Test
	public void readBySubtotal() {
		try {
			List<Listaventa> listaventa = listaventaService.readBySubtotal(500.0);
			assertEquals(listaventa.get(0).getSubtotal(), 500.0, 1);
		} catch (Exception e) {
			System.out.println("Error readListaventaBySubtotalTest: " + e);
		}
	}
}
