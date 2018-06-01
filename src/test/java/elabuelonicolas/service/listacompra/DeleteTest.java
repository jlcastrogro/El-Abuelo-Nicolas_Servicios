package elabuelonicolas.service.listacompra;

import static org.junit.Assert.assertNull;
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
public class DeleteTest {
	@Inject
	ListacompraService listacompraService;

	private Listacompra listacompra;
	
	@Before
	public void setUp() {
		this.listacompra = new Listacompra();
		this.listacompra.setIdcompra(4);
		this.listacompra.setIdproducto(1);
		this.listacompra.setCantidad(10);
		this.listacompra.setSubtotal(100.12);
	}

	@After
	public void tearDown() {
		this.listacompra = null;
	}

	@Test
	public void delete() {
		try {
			listacompraService.create(this.listacompra);
			this.listacompra.setId(listacompraService.last().getId());
			int id = this.listacompra.getId();

			listacompraService.delete(id);
			Listacompra c = listacompraService.read(id);

			assertNull(c);
		} catch (Exception e) {
			System.out.println("Error deleteCompraTest: " + e);
		}
	}
}
