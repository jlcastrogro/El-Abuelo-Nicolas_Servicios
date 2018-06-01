package elabuelonicolas.service.listacompra;

import static org.junit.Assert.assertEquals;
import java.util.List;
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
public class FindAllTest {
	@Inject
	ListacompraDao listacompraDao;
	private Object listacompra;

	@Before
	public void setUp() {
		this.listacompra = listacompraDao.findAll().size();
	}
	
	@After
	public void tearDown() {
		this.listacompra = null;
	}

	@Test
	public void findAll() {
		try {
			List<Listacompra> list = listacompraDao.findAll();
			assertEquals(list.size(), this.listacompra);
		} catch (Exception e) {
			System.out.println("Error findAllCompraTest: " + e);
		}
	}
}
