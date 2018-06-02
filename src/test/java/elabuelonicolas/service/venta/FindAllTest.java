package elabuelonicolas.service.venta;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Venta;
import elabuelonicolas.service.venta.VentaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class FindAllTest {
	@Inject
	VentaService ventaService;
	private Object ventas;

	@Before
	public void setUp() {
		this.ventas = ventaService.findAll().size();
	}
	
	@After
	public void tearDown() {
		this.ventas = null;
	}

	@Test
	public void findAll() {
		try {
			List<Venta> list = ventaService.findAll();
			assertEquals(list.size(), this.ventas);
		} catch (Exception e) {
			System.out.println("Error findAllTest: " + e);
		}
	}
}
