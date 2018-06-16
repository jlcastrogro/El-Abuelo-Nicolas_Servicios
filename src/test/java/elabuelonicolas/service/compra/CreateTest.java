package elabuelonicolas.service.compra;

import static org.junit.Assert.assertEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Compra;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class CreateTest {
	@Inject
	CompraService compraService;

	private Compra compra;
	
	@Before
	public void setUp() {
		this.compra = new Compra();
		this.compra.setIdproveedor(2);
		this.compra.setTotal(100.1);
	}

	@After
	public void tearDown() {
		compraService.delete(this.compra.getId());
	}
	
	@Test
	public void create() {
		try {
			compraService.create(this.compra);
			Compra c = compraService.last();
			
			assertEquals(c.getIdproveedor(), this.compra.getIdproveedor());
			
			this.compra.setId(c.getId());
		} catch (Exception e) {
			System.out.println("Error createCompraTest: " + e);
		}
	}
}
