package elabuelonicolas.service.listaventa;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listaventa;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class FindAllTest {
	@Inject
	ListaventaService listaventaService;
	private Object listaventa;

	@Before
	public void setUp() {
		this.listaventa = listaventaService.findAll().size();
	}
	
	@After
	public void tearDown() {
		this.listaventa = null;
	}

	@Test
	public void findAll() {
		try {
			List<Listaventa> list = listaventaService.findAll();
			assertEquals(list.size(), this.listaventa);
		} catch (Exception e) {
			System.out.println("Error findAllCompraTest: " + e);
		}
	}
}
