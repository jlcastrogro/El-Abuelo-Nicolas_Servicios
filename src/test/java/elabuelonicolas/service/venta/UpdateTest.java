package elabuelonicolas.service.venta; 
 
import static org.junit.Assert.assertNotEquals;
import java.sql.Date;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Venta;
import elabuelonicolas.service.venta.VentaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UpdateTest {
	@Inject
	VentaService ventaService;
	private Venta venta;

	@Before
	public void setUp() {
		this.venta = new Venta();
		this.venta.setIdcliente(1);
		this.venta.setTotal(100.10);
		this.venta.setTotalreal(100.10);
		this.venta.setGanancia(100.10);

		ventaService.create(this.venta);

		this.venta.setId(ventaService.last().getId());
	}

	@After
	public void tearDown() {
		ventaService.delete(this.venta.getId());
	}

	@Test
	public void update() {
		Venta v = ventaService.read(this.venta.getId());
		try {
			v.setIdcliente(2);
			v.setFecha(Date.valueOf("2018-5-2"));
			v.setTotal(1920812.1);
			ventaService.update(v);
		} catch (Exception e) {
			System.out.println("Error updateVentaTest: " + e);
		}

		assertNotEquals(this.venta.getIdcliente(), v.getIdcliente());
		assertNotEquals(this.venta.getFecha(), v.getFecha());
		assertNotEquals(this.venta.getTotal(), v.getTotal());
	}

	@Test
	public void updateIdCliente() {
		try {
			ventaService.updateIdCliente(this.venta.getId(), 2);
			Venta v = ventaService.read(this.venta.getId());
			assertNotEquals(v.getIdcliente(), this.venta.getIdcliente());
		} catch (Exception e) {
			System.out.println("Error updateVentaIdClienteTest: " + e);
		}
	}

	@Test
	public void updateFecha() {
		try {
			ventaService.updateFecha(this.venta.getId(), Date.valueOf("2018-5-10"));
			Venta c = ventaService.read(this.venta.getId());
			assertNotEquals(c.getFecha(), this.venta.getFecha());
		} catch (Exception e) {
			System.out.println("Error updateVentaFechaTest: " + e);
		}
	}

	@Test
	public void updatePrecioTotal() {
		try {
			ventaService.updateTotal(this.venta.getId(), 1000.1);
			Venta v = ventaService.read(this.venta.getId());
			assertNotEquals(v.getTotal(), this.venta.getTotal());
		} catch (Exception e) {
			System.out.println("Error updateVentaPrecioTotalTest: " + e);
		}
	}
}
