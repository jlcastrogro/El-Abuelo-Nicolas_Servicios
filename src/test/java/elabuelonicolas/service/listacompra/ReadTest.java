package elabuelonicolas.service.listacompra;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listacompra;
import elabuelonicolas.dao.listacompra.ListacompraDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	ListacompraDao listacompraDao;

	@Test
	public void read() {
		try {
			Listacompra compra = listacompraDao.read(1);
			assertEquals(compra.getId(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByIdCompra() {
		try {
			List<Listacompra> listacompra = listacompraDao.readByIdCompra(1);
			assertEquals(listacompra.get(0).getIdcompra(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readByIdCompraTest: " + e);
		}
	}
	
	@Test
	public void readByProducto() {
		try {
			List<Listacompra> listacompra = listacompraDao.readByIdProducto(1);
			assertEquals(listacompra.get(0).getIdcompra(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readByProductoTest: " + e);
		}
	}
	
	@Test
	public void readByCantidad() {
		try {
			List<Listacompra> listacompra = listacompraDao.readByCantidad(21);
			assertEquals(listacompra.get(0).getCantidad(), 21, 1);
		} catch (Exception e) {
			System.out.println("Error readByCantidadTest: " + e);
		}
	}
	
	@Test
	public void readBySubtotal() {
		try {
			List<Listacompra> listacompra = listacompraDao.readBySubtotal(123.1);
			assertEquals(listacompra.get(0).getSubtotal(), 123.1, 1);
		} catch (Exception e) {
			System.out.println("Error readBySubtotalTest: " + e);
		}
	}
}
