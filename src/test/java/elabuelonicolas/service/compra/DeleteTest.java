package elabuelonicolas.service.compra;

import static org.junit.Assert.assertNull;
import java.sql.Date;
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
public class DeleteTest {
	@Inject
	CompraService compraService;

	private Compra compra;
	
	@Before
	public void setUp() {
		this.compra = new Compra();
		this.compra.setIdproveedor(1);
		this.compra.setFecha(Date.valueOf("2018-1-1"));
		this.compra.setTotal(100.1);
	}

	@After
	public void tearDown() {
		this.compra = null;
	}

	@Test
	public void delete() {
		try {
			compraService.create(this.compra);
			this.compra.setId(compraService.last().getId());
			int id = this.compra.getId();

			compraService.delete(id);
			Compra c = compraService.read(id);

			assertNull(c);
		} catch (Exception e) {
			System.out.println("Error deleteCompraTest: " + e);
		}
	}
}
