package elabuelonicolas.service.cliente;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Cliente;
import elabuelonicolas.service.cliente.ClienteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class FindAllTest {
	@Inject
	ClienteService clienteService;
	private Object clientes;

	@Before
	public void setUp() {
		this.clientes = clienteService.findAll().size();
	}
	
	@After
	public void tearDown() {
		this.clientes = null;
	}

	@Test
	public void findAll() {
		try {
			List<Cliente> list = clienteService.findAll();
			assertEquals(list.size(), this.clientes);
		} catch (Exception e) {
			System.out.println("Error findAllTest: " + e);
		}
	}
}
