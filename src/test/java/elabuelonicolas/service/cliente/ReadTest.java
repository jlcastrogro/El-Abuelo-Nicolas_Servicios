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
			System.out.println("Error readClienteTest: " + e);
		}
	}

	@Test
	public void readByNombre() {
		try {
			List<Cliente> clientes = clienteService.readByNombre("Aurrera");
			assertEquals(clientes.get(0).getNombre(), "Aurrera");
		} catch (Exception e) {
			System.out.println("Error readClienteByNombreTest: " + e);
		}
	}

	@Test
	public void readByContacto() {
		try {
			List<Cliente> clientes = clienteService.readByContacto("José Luis");
			assertEquals(clientes.get(0).getContacto(), "José Luis");
		} catch (Exception e) {
			System.out.println("Error readClienteByContactoTest: " + e);
		}
	}

	@Test
	public void readByTelefono() {
		try {
			Cliente clientes = clienteService.readByTelefono("9535362391");
			assertEquals(clientes.getTelefono(), "9535362391");
		} catch (Exception e) {
			System.out.println("Error readClienteByTelefonoTest: " + e);
		}
	}

	@Test
	public void readByEmail() {
		try {
			Cliente clientes = clienteService.readByEmail("contacto@aurrera.com");
			assertEquals(clientes.getEmail(), "contacto@aurrera.com");
		} catch (Exception e) {
			System.out.println("Error readClienteByEmailTest: " + e);
		}
	}

	@Test
	public void readByRfc() {
		try {
			Cliente clientes = clienteService.readByRfc("928HEND938HDNOWIN");
			assertEquals(clientes.getRfc(), "928HEND938HDNOWIN");
		} catch (Exception e) {
			System.out.println("Error readClienteByRfcTest: " + e);
		}
	}
}
