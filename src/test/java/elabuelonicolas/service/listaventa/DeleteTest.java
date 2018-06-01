package elabuelonicolas.service.listaventa;

import static org.junit.Assert.assertNull;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listaventa;
import elabuelonicolas.dao.listaventa.ListaventaDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class DeleteTest {
	@Inject
	ListaventaDao ListaventaDao;

	private Listaventa listaventa;
	
	@Before
	public void setUp() {
		this.listaventa = new Listaventa();
		this.listaventa.setIdventa(4);
		this.listaventa.setIdproducto(1);
		this.listaventa.setCantidad(10);
		this.listaventa.setSubtotal(100.12);
	}

	@After
	public void tearDown() {
		this.listaventa = null;
	}

	@Test
	public void delete() {
		try {
			ListaventaDao.create(this.listaventa);
			this.listaventa.setId(ListaventaDao.last().getId());
			int id = this.listaventa.getId();

			ListaventaDao.delete(id);
			Listaventa c = ListaventaDao.read(id);

			assertNull(c);
		} catch (Exception e) {
			System.out.println("Error deleteCompraTest: " + e);
		}
	}
}
