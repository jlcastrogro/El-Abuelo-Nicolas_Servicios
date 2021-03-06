package elabuelonicolas.service.compra;

import static org.junit.Assert.assertNotEquals;

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
public class UpdateTest {
	@Inject
	CompraService compraService;

	private Compra compra;
	
	@Before
	public void setUp() {
		this.compra = new Compra();
		this.compra.setIdproveedor(1);
		this.compra.setTotal(100.1);
		compraService.create(this.compra);
		this.compra.setId(compraService.last().getId());
	}

	@After
	public void tearDown() {
		compraService.delete(this.compra.getId());
	}

	@Test
	public void update() {
		Compra c = compraService.read(this.compra.getId());
		try {
			c.setIdproveedor(2);
			c.setFecha(Date.valueOf("2018-12-1"));
			c.setTotal(105.5);
			compraService.update(c);
		} catch (Exception e) {
			System.out.println("Error updateCompraTest: " + e);
		}

		assertNotEquals(this.compra.getIdproveedor(), c.getIdproveedor());
		assertNotEquals(this.compra.getFecha(), c.getFecha());
		assertNotEquals(this.compra.getFecha(), c.getFecha());
	}

	@Test
	public void updateIdProveedor() {
		try {
			compraService.updateIdProveedor(this.compra.getId(), 2);
			Compra c = compraService.read(this.compra.getId());
			assertNotEquals(c.getIdproveedor(), this.compra.getIdproveedor());
		} catch (Exception e) {
			System.out.println("Error updateCompraProveedorTest: " + e);
		}
	}

	@Test
	public void updateTotal() {
		try {
			compraService.updateTotal(this.compra.getId(), 100.112);
			Compra c = compraService.read(this.compra.getId());
			assertNotEquals(c.getTotal(), this.compra.getTotal());
		} catch (Exception e) {
			System.out.println("Error updateCompraTotalTest: " + e);
		}
	}
}
