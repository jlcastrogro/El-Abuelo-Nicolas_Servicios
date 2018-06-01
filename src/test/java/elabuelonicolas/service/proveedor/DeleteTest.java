package elabuelonicolas.service.proveedor;

import static org.junit.Assert.assertNull;
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
public class DeleteTest {

	@Inject
	ProveedorService proveedorService;

	private Proveedor proveedor;

	@Before
	public void setUp() {
		this.proveedor = new Proveedor();
		this.proveedor.setNombre("Coopel");
		this.proveedor.setContacto("Nicolas");
		this.proveedor.setIddireccion(3);
		this.proveedor.setEmail("coopelhj@gmail.com");
		this.proveedor.setRfc("COPH455672HPLCRD55");
		this.proveedor.setTelefono("9531294557");
		proveedorService.create(this.proveedor);
		this.proveedor.setId(proveedorService.last().getId());
	}

	@After
	public void tearDown() {
		this.proveedor = null;
	}

	@Test
	public void delete() {
		try {
			int id = this.proveedor.getId();
			
			proveedorService.delete(id);
			Proveedor p = proveedorService.read(id);

			assertNull(p);
		} catch (Exception e) {
			System.out.println("Error deleteTest: " + e);
		}
	}
}
