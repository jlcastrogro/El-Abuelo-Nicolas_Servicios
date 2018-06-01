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
import elabuelonicolas.dao.producto.ProductoDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class CreateTest {
	@Inject
	ProductoDao productoDao;

	private Producto producto;

	@Before
	public void setUp() {
		this.producto = new Producto();
		this.producto.setTipo("Elektra");
		this.producto.setMarca("Jose");
		this.producto.setCosto(3.1);
		this.producto.setExistencia(12);
	}

	@After
	public void tearDown() {
		this.productoDao.delete(this.producto.getId());
	}
	
	@Test
	public void create() {
		try {
			productoDao.create(this.producto);
			Producto c = productoDao.last();

			assertEquals(c.getTipo(), this.producto.getTipo());
			
			this.producto.setId(c.getId());
		} catch (Exception e) {
			System.out.println("Error createTest: " + e);
		}
	}
}
