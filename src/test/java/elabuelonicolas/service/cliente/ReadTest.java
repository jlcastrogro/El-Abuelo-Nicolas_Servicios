package elabuelonicolas.service.cliente;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
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

	@Test
	public void read() {
		try {
			Cliente cliente = clienteService.read(1);
			assertEquals((int) cliente.getId(), 1);
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByNombre() {
		try {
			List<Cliente> clientes = clienteService.readByNombre("José Luis");
			assertEquals(clientes.get(0).getNombre(), "José Luis");
		} catch (Exception e) {
			System.out.println("Error readByNombreTest: " + e);
		}
	}

	@Test
	public void readByDireccion() {
		try {
			Cliente cliente = clienteService.readByDireccion(1);
			assertEquals((int) cliente.getIddireccion(), 1);
		} catch (Exception e) {
			System.out.println("Error readByDireccionTest: " + e);
		}
	}

	@Test
	public void readByContacto() {
		try {
			List<Cliente> clientes = clienteService.readByContacto("Castro");
			assertEquals(clientes.get(0).getContacto(), "Castro");
		} catch (Exception e) {
			System.out.println("Error readByContactoTest: " + e);
		}
	}

	@Test
	public void readByTelefono() {
		try {
			List<Cliente> clientes = clienteService.readByTelefono("9535362391");
			assertEquals(clientes.get(0).getTelefono(), "9535362391");
		} catch (Exception e) {
			System.out.println("Error readByTelefonoTest: " + e);
		}
	}

	@Test
	public void readByEmail() {
		try {
			List<Cliente> clientes = clienteService.readByEmail("jlcastrogro@gmail.com");
			assertEquals(clientes.get(0).getEmail(), "jlcastrogro@gmail.com");
		} catch (Exception e) {
			System.out.println("Error readByEmailTest: " + e);
		}
	}

	@Test
	public void readByRfc() {
		try {
			List<Cliente> clientes = clienteService.readByRfc("KUCNW4NW4RN");
			assertEquals(clientes.get(0).getRfc(), "KUCNW4NW4RN");
		} catch (Exception e) {
			System.out.println("Error readByRfcTest: " + e);
		}
	}
}
