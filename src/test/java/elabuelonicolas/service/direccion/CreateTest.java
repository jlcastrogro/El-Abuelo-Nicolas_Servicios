package elabuelonicolas.service.direccion;

import static org.junit.Assert.assertEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Direccion;
import elabuelonicolas.dao.direccion.DireccionDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class CreateTest {
	@Inject
	DireccionDao direccionDao;

	private Direccion direccion;

	@Before
	public void setUp() {
		this.direccion = new Direccion();
		this.direccion.setPais("México");
		this.direccion.setEstado("Oaxaca");
		this.direccion.setCiudad("Huajuapan");
		this.direccion.setColonia("Centro");
		this.direccion.setCalle("Santa Fe");
		this.direccion.setNumero(9);
	}

	@After
	public void tearDown() {
		this.direccion = null;
	}
	
	@Test
	public void create() {
		try {
			direccionDao.create(this.direccion);
			Direccion d = direccionDao.last();
			
			assertEquals(d.getPais(), this.direccion.getPais());
			
			this.direccion.setId(d.getId());
		} catch (Exception e) {
			System.out.println("Error createTest: " + e);
		}
	}
}
