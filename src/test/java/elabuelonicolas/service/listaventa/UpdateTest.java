package elabuelonicolas.service.listaventa;

import static org.junit.Assert.assertNotEquals;
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
		this.listaventa.setSubtotal(100.12);
		
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
			System.out.println("Update");
			c.setIdventa(2);
			c.setIdproducto(5);
			c.setCantidad(100);
			c.setSubtotal(105.5);
			listaventaService.update(c);
		} catch (Exception e) {
			System.out.println("Error updateListaCompraTest: " + e);
		}

		assertNotEquals(this.listaventa.getIdventa(), c.getIdventa());
		assertNotEquals(this.listaventa.getIdproducto(), c.getIdproducto());
		assertNotEquals(this.listaventa.getCantidad(), c.getCantidad());
		assertNotEquals(this.listaventa.getSubtotal(), c.getSubtotal());
	}

	@Test
	public void updateIdVenta() {
		try {
			System.out.println("UpdateProveedor");
			listaventaService.updateIdVenta(this.listaventa.getId(), 2);
			Listaventa c = listaventaService.read(this.listaventa.getId());
			assertNotEquals(c.getIdventa(), this.listaventa.getIdventa());
		} catch (Exception e) {
			System.out.println("Error updateListaCompraTest: " + e);
		}
	}

	@Test
	public void updateSubtotal() {
		try {
			System.out.println("UpdateEmail");
			listaventaService.updateSubtotal(this.listaventa.getId(), 100.112);
			Listaventa c = listaventaService.read(this.listaventa.getId());
			assertNotEquals(c.getSubtotal(), this.listaventa.getSubtotal());
		} catch (Exception e) {
			System.out.println("Error updateSubtotalTest: " + e);
		}
	}
}
