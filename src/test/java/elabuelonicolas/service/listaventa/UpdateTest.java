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
public class UpdateTest {
	@Inject
	ListaventaService listaventaService;

	private Listaventa listaventa;
	
	@Before
	public void setUp() {
		this.listaventa = new Listaventa();
		this.listaventa.setIdventa(4);
		this.listaventa.setIdproducto(1);
		this.listaventa.setCantidad(10);
		this.listaventa.setSubtotal(99.0);
		this.listaventa.setSubtotalreal(100.12);
		this.listaventa.setGanancia(12.1);

		listaventaService.create(this.listaventa);

		this.listaventa.setId(listaventaService.last().getId());
	}

	@After
	public void tearDown() {
		listaventaService.delete(this.listaventa.getId());
	}

	@Test
	public void update() {
		Listaventa c = listaventaService.read(this.listaventa.getId());
		try {
			c.setIdventa(2);
			c.setIdproducto(3);
			c.setCantidad(100);
			c.setSubtotal(105.5);
			c.setSubtotalreal(100.12);
			c.setGanancia(12.1);
			listaventaService.update(c);
		} catch (Exception e) {
			System.out.println("Error updateListaventaTest: " + e);
		}

		assertEquals(2, c.getIdventa(), 1);
		assertEquals(3, c.getIdproducto(), 1);
		assertEquals(100, c.getCantidad(), 1);
		assertEquals(105.5, c.getSubtotal(), 1);
	}

	@Test
	public void updateIdVenta() {
		try {
			listaventaService.updateIdVenta(this.listaventa.getId(), 2);
			Listaventa c = listaventaService.read(this.listaventa.getId());
			assertEquals(c.getIdventa(), 2, 1);
		} catch (Exception e) {
			System.out.println("Error updateListaventaTest: " + e);
		}
	}

	@Test
	public void updateSubtotal() {
		try {
			listaventaService.updateSubtotal(this.listaventa.getId(), 100.0);
			Listaventa c = listaventaService.read(this.listaventa.getId());
			assertEquals(c.getSubtotal(), 100.0, 1);
		} catch (Exception e) {
			System.out.println("Error updateListaventaSubtotalTest: " + e);
		}
	}
}
