package elabuelonicolas.service.producto;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Producto;
import elabuelonicolas.service.producto.ProductoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	ProductoService productoService;

	@Test
	public void read() {
		try {
			Producto p = productoService.read(1);
			assertEquals(p.getId(), 1, 1);
		} catch (Exception e) {
			System.out.println("Error readProductoTest: " + e);
		}
	}

	@Test
	public void readByTipo() {
		try {
			List<Producto> producto = productoService.readByTipo("Balón");
			assertEquals(producto.get(0).getTipo(), "Balón");
		} catch (Exception e) {
			System.out.println("Error readProductoByTipoTest: " + e);
		}
	}

	@Test
	public void readByMarca() {
		try {
			List<Producto> producto = productoService.readByMarca("Nike");
			assertEquals(producto.get(0).getMarca(), "Nike");
		} catch (Exception e) {
			System.out.println("Error readProductoByMarcaTest: " + e);
		}
	}

	@Test
	public void readByCosto() {
		try {
			List<Producto> producto = productoService.readByCostoCompra(200.0);
			assertEquals(producto.get(0).getCostocompra(), 200.0, 1);
		} catch (Exception e) {
			System.out.println("Error readProductoByCostoTest: " + e);
		}
	}

	@Test
	public void readByExistencia() {
		try {
			List<Producto> producto = productoService.readByExistencia(10);
			assertEquals(producto.get(0).getExistencia(), 10, 1);
		} catch (Exception e) {
			System.out.println("Error readProductoByExistenciaTest: " + e);
		}
	}
}
