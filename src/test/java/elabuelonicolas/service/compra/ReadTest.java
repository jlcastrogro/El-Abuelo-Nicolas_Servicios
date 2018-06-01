package elabuelonicolas.service.compra;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Compra;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	CompraService compraService;

	@Test
	public void read() {
		try {
			Compra compra = compraService.read(1);
			assertEquals((int) compra.getIdproveedor(), 1);
		} catch (Exception e) {
			System.out.println("Error readCompraTest: " + e);
		}
	}

	@Test
	public void readByIdProveedor() {
		try {
			List<Compra> compras = compraService.readByIdProveedor(1);
			assertEquals((int) compras.get(0).getIdproveedor(), 1);
		} catch (Exception e) {
			System.out.println("Error readCompraByProveedorTest: " + e);
		}
	}
	
	@Test
	public void readByFecha() {
		try {
			List<Compra> compras = compraService.readByFecha(Date.valueOf("2018-05-01"));
			assertEquals(compras.get(0).getFecha(), Date.valueOf("2018-05-01"));
		} catch (Exception e) {
			System.out.println("Error readCompraByFechaTest: " + e);
		}
	}
	
	@Test
	public void readByTotal() {
		try {
			List<Compra> compras = compraService.readByTotal(12.121);
			assertEquals(compras.get(0).getTotal(), 12.121, 1);
		} catch (Exception e) {
			System.out.println("Error readCompraByTotalTest: " + e);
		}
	}
}
