package elabuelonicolas.service.proveedor;

import static org.junit.Assert.assertEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Proveedor;
import elabuelonicolas.service.proveedor.ProveedorService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class CreateTest {
	@Inject
	ProveedorService proveedorService;

	private Proveedor proveedor;

	@Before
	public void setUp() {
		this.proveedor = new Proveedor();
		this.proveedor.setNombre("Elektra");
		this.proveedor.setContacto("Jose");
		this.proveedor.setIddireccion(3);
		this.proveedor.setEmail("elektrahj@gmail.com");
		this.proveedor.setRfc("EKHJ984317HPLCRM09");
		this.proveedor.setTelefono("9551239856");
	}

	@After
	public void tearDown() {
		this.proveedorService.delete(this.proveedor.getId());
	}
	
	@Test
	public void create() {
		try {
			proveedorService.create(this.proveedor);
			Proveedor c = proveedorService.last();

			assertEquals(c.getNombre(), this.proveedor.getNombre());
			
			this.proveedor.setId(c.getId());
		} catch (Exception e) {
			System.out.println("Error createTest: " + e);
		}
	}
}
