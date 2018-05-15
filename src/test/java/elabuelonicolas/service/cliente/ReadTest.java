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
public class ReadTest {
	@Inject
	ClienteService clienteService;

	private Cliente cliente;

	@Before
	public void setUp() {
		this.cliente = new Cliente();
		this.cliente.setNombre("Paco");
		this.cliente.setDireccion("Acatlima");
		this.cliente.setContacto("Josué");
		this.cliente.setTelefono("951507892");
		this.cliente.setEmail("jlgro@gmail.com");
		this.cliente.setRfc("CACG960419HOCSRS00");

		clienteService.create(this.cliente);

		this.cliente.setId(clienteService.last().getId());
	}

	@After
	public void tearDown() {
		this.cliente = null;
	}

	@Test
	public void read() {
		try {
			Cliente c = clienteService.read(this.cliente.getId());
			assertEquals(c.getId(), this.cliente.getId());
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByNombre() {
		try {
			List<Cliente> clientes = clienteService.readByNombre(this.cliente.getNombre());
			assertEquals(clientes.get(0).getNombre(), this.cliente.getNombre());
		} catch (Exception e) {
			System.out.println("Error readByNombreTest: " + e);
		}
	}

	@Test
	public void readByDireccion() {
		try {
			List<Cliente> clientes = clienteService.readByDireccion(this.cliente.getDireccion());
			assertEquals(clientes.get(0).getDireccion(), this.cliente.getDireccion());
		} catch (Exception e) {
			System.out.println("Error readByDireccionTest: " + e);
		}
	}

	@Test
	public void readByContacto() {
		try {
			List<Cliente> clientes = clienteService.readByContacto(this.cliente.getContacto());
			assertEquals(clientes.get(0).getContacto(), this.cliente.getContacto());
		} catch (Exception e) {
			System.out.println("Error readByContactoTest: " + e);
		}
	}

	@Test
	public void readByTelefono() {
		try {
			List<Cliente> clientes = clienteService.readByTelefono(this.cliente.getTelefono());
			assertEquals(clientes.get(0).getTelefono(), this.cliente.getTelefono());
		} catch (Exception e) {
			System.out.println("Error readByTelefonoTest: " + e);
		}
	}

	@Test
	public void readByEmail() {
		try {
			List<Cliente> clientes = clienteService.readByEmail(this.cliente.getEmail());
			assertEquals(clientes.get(0).getEmail(), this.cliente.getEmail());
		} catch (Exception e) {
			System.out.println("Error readByEmailTest: " + e);
		}
	}

	@Test
	public void readByRfc() {
		try {
			List<Cliente> clientes = clienteService.readByRfc(this.cliente.getRfc());
			assertEquals(clientes.get(0).getRfc(), this.cliente.getRfc());
		} catch (Exception e) {
			System.out.println("Error readByRfcTest: " + e);
		}
	}
}
