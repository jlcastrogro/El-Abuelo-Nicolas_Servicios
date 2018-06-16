package elabuelonicolas.service.producto;

import static org.junit.Assert.assertEquals;
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
public class CreateTest {
	@Inject
	ProductoService productoService;

	private Producto producto;

	@Before
	public void setUp() {
		this.producto = new Producto();
		this.producto.setTipo("Elektra");
		this.producto.setMarca("Jose");
		this.producto.setCostocompra(3.1);
		this.producto.setCostoventa(3.1);
		this.producto.setExistencia(12);
		this.producto.setStatus(1);
	}

	@After
	public void tearDown() {
		this.productoService.delete(this.producto.getId());
	}
	
	@Test
	public void create() {
		try {
			productoService.create(this.producto);
			Producto c = productoService.last();

			assertEquals(c.getTipo(), this.producto.getTipo());
			
			this.producto.setId(c.getId());
		} catch (Exception e) {
			System.out.println("Error createProductoTest: " + e);
		}
	}
}
