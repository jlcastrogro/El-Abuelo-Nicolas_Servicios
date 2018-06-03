package elabuelonicolas.service.direccion;

import static org.junit.Assert.assertNull;
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
public class DeleteTest {
	@Inject
	DireccionDao direccionDao;

	private Direccion direccion;

	@Before
	public void setUp() {
		this.direccion = new Direccion();
		this.direccion.setPais("México");
		this.direccion.setEstado("Oaxaca");
		this.direccion.setCiudad("Huajuapan");
		this.direccion.setColonia("El Carmen");
		this.direccion.setCalle("Triunfo");
		this.direccion.setNumero(13);
		direccionDao.create(this.direccion);
		this.direccion.setId(direccionDao.last().getId());
	}

	@After
	public void tearDown() {
		this.direccion = null;
	}

	@Test
	public void delete() {
		try {
			direccionDao.delete(this.direccion.getId());

			int id = this.direccion.getId();
			Direccion d = direccionDao.read(id);

			assertNull(d);
		} catch (Exception e) {
			System.out.println("Error deleteTest: " + e);
		}
	}
}
