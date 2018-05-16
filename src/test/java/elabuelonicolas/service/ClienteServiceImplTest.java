package elabuelonicolas.service;

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
public class ClienteServiceImplTest {
	@Inject
	ClienteService clienteService;

	@Test
	public void findAll() {
		try {
			List<Cliente> lista = clienteService.findAll();
			System.out.println("FinAll");
			for (Cliente c : lista) {
				System.out.println("Id: " + c.getId());
				System.out.println("Nombre: " + c.getNombre());
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
	}

	@Test
	public void createCliente() {
		Cliente c = new Cliente();
		try {
			c.setNombre("Luis");
			c.setContacto("Castro");
			c.setDireccion("Acatlima");
			c.setEmail("jlcastrogro@gmail.com");
			c.setRfc("CACG950419HOCSRS00");
			c.setTelefono("9515007892");
			clienteService.create(c);
			System.out.println("Create");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Test
	public void readCliente() {
		try {
			Cliente c = clienteService.readById(9);
			System.out.println(c.getId());
			System.out.println(c.getNombre());
			System.out.println("Read");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void updateCliente() {
		Cliente c = clienteService.readById(10);
		try {
			c.setNombre("Luis");
			c.setContacto("Castro");
			c.setDireccion("Acatlima");
			c.setEmail("jlcastrogro@gmail.com");
			c.setRfc("CACG950419HOCSRS00");
			c.setTelefono("9515007892");
			clienteService.update(c);
			System.out.println("Update");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Test
	public void deleteCliente() {
		try {
			clienteService.delete(14);
			System.out.println("Delete");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}

}
