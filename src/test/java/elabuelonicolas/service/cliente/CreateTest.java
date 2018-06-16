package elabuelonicolas.service.cliente;

import static org.junit.Assert.assertEquals;
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
public class CreateTest {
	@Inject
	ClienteService clienteService;

	private Cliente cliente;

	@Before
	public void setUp() {
		this.cliente = new Cliente();
		this.cliente.setNombre("José");
		this.cliente.setContacto("Josué");
		this.cliente.setEmail("jlcastro@gmail.com");
		this.cliente.setRfc("CACG950419HCSRS00");
		this.cliente.setTelefono("9515007893");
		this.cliente.setEstado("Oaxaca");
		this.cliente.setMunicipio("Putla");
		this.cliente.setLocalidad("Putla");
		this.cliente.setCodigopostal(71000);
		this.cliente.setAsentamiento("Col. Centro");
		this.cliente.setCalle("Oaxaca");
		this.cliente.setNumero(123);
		this.cliente.setStatus(1);
	}

	@After
	public void tearDown() {
		clienteService.delete(this.cliente.getId());
	}
	
	@Test
	public void create() {
		try {
			clienteService.create(this.cliente);
			Cliente c = clienteService.last();
			
			assertEquals(c.getNombre(), this.cliente.getNombre());
			
			this.cliente.setId(c.getId());
		} catch (Exception e) {
			System.out.println("Error createClienteTest: " + e);
		}
	}
}
