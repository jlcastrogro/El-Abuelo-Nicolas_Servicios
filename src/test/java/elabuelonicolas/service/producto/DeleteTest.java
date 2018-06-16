package elabuelonicolas.service.producto;

import static org.junit.Assert.assertNull;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Producto;
import elabuelonicolas.service.producto.ProductoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DeleteTest {
	@Inject
	ProductoService productoService;

	private Producto producto;

	@Before
	public void setUp() {
		this.producto = new Producto();
		this.producto.setTipo("Balón");
		this.producto.setMarca("Puma");
		this.producto.setCostocompra(3.1);
		this.producto.setCostoventa(3.1);
		this.producto.setExistencia(12);
		this.producto.setStatus(1);
		productoService.create(this.producto);
		this.producto.setId(productoService.last().getId());
	}

	@After
	public void tearDown() {
		this.producto = null;
	}

	@Test
	public void delete() {
		try {
			int id = this.producto.getId();
			
			productoService.delete(id);
			Producto p = productoService.read(id);

			assertNull(p);
		} catch (Exception e) {
			System.out.println("Error deleteProductoTest: " + e);
		}
	}
}
