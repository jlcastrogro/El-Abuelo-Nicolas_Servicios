package elabuelonicolas.service.listaventa;

import static org.junit.Assert.assertEquals;
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
public class CreateTest {
	@Inject
	ListaventaDao listaventaDao;

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
		listaventaDao.delete(this.listaventa.getId());
	}
	
	@Test
	public void create() {
		try {
			listaventaDao.create(this.listaventa);
			Listaventa c = listaventaDao.last();
			
			assertEquals(c.getIdventa(), this.listaventa.getIdventa());
			
			this.listaventa.setId(c.getId());
		} catch (Exception e) {
			System.out.println("Error createListaventaTest: " + e);
		}
	}
}
