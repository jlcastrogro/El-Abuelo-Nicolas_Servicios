package elabuelonicolas.service.listacompra;

import static org.junit.Assert.assertNotEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listacompra;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UpdateTest {
	@Inject
	ListacompraService listacompraService;

	private Listacompra listaCompra;
	
	@Before
	public void setUp() {
		this.listaCompra = new Listacompra();
		this.listaCompra.setIdcompra(4);
		this.listaCompra.setIdproducto(1);
		this.listaCompra.setCantidad(10);
		this.listaCompra.setSubtotal(100.12);
		
		listacompraService.create(this.listaCompra);

		this.listaCompra.setId(listacompraService.last().getId());
	}

	@After
	public void tearDown() {
		listacompraService.delete(this.listaCompra.getId());
	}

	@Test
	public void update() {
		Listacompra c = listacompraService.read(this.listaCompra.getId());
		try {
			c.setIdcompra(2);
			c.setIdproducto(5);
			c.setCantidad(100);
			c.setSubtotal(105.5);
			listacompraService.update(c);
		} catch (Exception e) {
			System.out.println("Error updateListaCompraTest: " + e);
		}

		assertNotEquals(this.listaCompra.getIdcompra(), c.getIdcompra());
		assertNotEquals(this.listaCompra.getIdproducto(), c.getIdproducto());
		assertNotEquals(this.listaCompra.getCantidad(), c.getCantidad());
		assertNotEquals(this.listaCompra.getSubtotal(), c.getSubtotal());
	}

	@Test
	public void updateIdCompra() {
		try {
			listacompraService.updateIdCompra(this.listaCompra.getId(), 2);
			Listacompra c = listacompraService.read(this.listaCompra.getId());
			assertNotEquals(c.getIdcompra(), this.listaCompra.getIdcompra());
		} catch (Exception e) {
			System.out.println("Error updateListaCompraIdCompraTest: " + e);
		}
	}

	@Test
	public void updateSubtotal() {
		try {
			listacompraService.updateSubtotal(this.listaCompra.getId(), 100.112);
			Listacompra c = listacompraService.read(this.listaCompra.getId());
			assertNotEquals(c.getSubtotal(), this.listaCompra.getSubtotal());
		} catch (Exception e) {
			System.out.println("Error updateListacompraSubtotalTest: " + e);
		}
	}
}
