package elabuelonicolas.service.direccion;

import static org.junit.Assert.assertEquals;
import java.util.List;
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
public class FindAllTest {
	@Inject
	DireccionDao direccionDao;
	private Object direccion;

	@Before
	public void setUp() {
		this.direccion = direccionDao.findAll().size();
	}
	
	@After
	public void tearDown() {
		this.direccion = null;
	}

	@Test
	public void findAll() {
		try {
			List<Direccion> list = direccionDao.findAll();
			assertEquals(list.size(), this.direccion);
		} catch (Exception e) {
			System.out.println("Error findAllTest: " + e);
		}
	}
}
