package elabuelonicolas.service.listacompra;

import static org.junit.Assert.assertEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Listacompra;
import elabuelonicolas.dao.listacompra.ListacompraDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class CreateTest {
	@Inject
	ListacompraDao listacompraDao;

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
		listacompraDao.delete(this.listacompra.getId());
	}
	
	@Test
	public void create() {
		try {
			listacompraDao.create(this.listacompra);
			Listacompra c = listacompraDao.last();
			
			assertEquals(c.getIdcompra(), this.listacompra.getIdcompra());
			
			this.listacompra.setId(c.getId());
		} catch (Exception e) {
			System.out.println("Error createListacompraTest: " + e);
		}
	}
}
