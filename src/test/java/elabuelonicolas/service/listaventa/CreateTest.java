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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class CreateTest {
	@Inject
	ListaventaService listaventaService;

	private Listaventa listaventa;
	
	@Before
	public void setUp() {
		this.listaventa = new Listaventa();
		this.listaventa.setIdventa(4);
		this.listaventa.setIdproducto(1);
		this.listaventa.setCantidad(10);
		this.listaventa.setSubtotal(100.12);
		this.listaventa.setSubtotalreal(100.12);
		this.listaventa.setGanancia(12.1);
	}

	@After
	public void tearDown() {
		listaventaService.delete(this.listaventa.getId());
	}
	
	@Test
	public void create() {
		try {
			listaventaService.create(this.listaventa);
			Listaventa c = listaventaService.last();
			
			assertEquals(c.getIdventa(), this.listaventa.getIdventa());
			
			this.listaventa.setId(c.getId());
		} catch (Exception e) {
			System.out.println("Error createListaventaTest: " + e);
		}
	}
}
