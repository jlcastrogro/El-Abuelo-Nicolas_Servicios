package elabuelonicolas.service.proveedor;

import static org.junit.Assert.assertEquals;
import java.util.List;
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
public class FindAllTest {
	@Inject
	ProveedorService proveedorService;
	private Object proveedor;

	@Before
	public void setUp() {
		this.proveedor = proveedorService.findAll().size();
	}
	
	@After
	public void tearDown() {
		this.proveedor = null;
	}

	@Test
	public void findAll() {
		try {
			List<Proveedor> list = proveedorService.findAll();
			assertEquals(list.size(), this.proveedor);
		} catch (Exception e) {
			System.out.println("Error findAllTest: " + e);
		}
	}
}
