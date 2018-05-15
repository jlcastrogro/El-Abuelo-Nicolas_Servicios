package elabuelonicolas.service.cliente.test;

import static org.junit.Assert.assertNotEquals;
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
public class UpdateTest {
	@Inject
	ClienteService clienteService;
	private Cliente cliente;

	@Before
	public void setUp() {
		this.cliente = new Cliente();
		this.cliente.setNombre("Pedro");
		this.cliente.setDireccion("Oaxaca");
		this.cliente.setContacto("José");
		this.cliente.setTelefono("9515787892");
		this.cliente.setEmail("pedro@gmail.com");
		this.cliente.setRfc("QBUE72BDU");

		clienteService.create(this.cliente);

		this.cliente.setId(clienteService.last().getId());
	}

	@After
	public void tearDown() {
		this.cliente = null;
	}

	@Test
	public void update() {
		Cliente c = clienteService.read(this.cliente.getId());
		try {
			System.out.println("Update");
			c.setNombre("Luis");
			c.setDireccion("Putla");
			c.setContacto("Guerrero");
			c.setTelefono("9535362398");
			c.setEmail("jlcastrogro@outlook.com");
			c.setRfc("QNEOQINE39NXWO3");
			clienteService.update(c);
		} catch (Exception e) {
			System.out.println("Error updateTest: " + e);
		}

		assertNotEquals(this.cliente.getNombre(), c.getNombre());
		assertNotEquals(this.cliente.getDireccion(), c.getDireccion());
		assertNotEquals(this.cliente.getContacto(), c.getContacto());
		assertNotEquals(this.cliente.getTelefono(), c.getTelefono());
		assertNotEquals(this.cliente.getEmail(), c.getEmail());
		assertNotEquals(this.cliente.getRfc(), c.getRfc());
	}

	@Test
	public void updateNombre() {
		try {
			System.out.println("UpdateName");
			clienteService.updateNombre(this.cliente.getId(), "Jaime");
			Cliente c = clienteService.read(this.cliente.getId());
			assertNotEquals(c.getNombre(), this.cliente.getNombre());
		} catch (Exception e) {
			System.out.println("Error updateNombreTest: " + e);
		}
	}

	@Test
	public void updateDireccion() {
		try {
			System.out.println("UpdateAddress");
			clienteService.updateDireccion(this.cliente.getId(), "Huajuapan");
			Cliente c = clienteService.read(this.cliente.getId());
			assertNotEquals(c.getDireccion(), this.cliente.getDireccion());
		} catch (Exception e) {
			System.out.println("Error updateDireccionTest: " + e);
		}
	}

	@Test
	public void updateContacto() {
		try {
			System.out.println("UpdateContact");
			clienteService.updateContacto(this.cliente.getId(), "Egremy");
			Cliente c = clienteService.read(this.cliente.getId());
			assertNotEquals(c.getContacto(), this.cliente.getContacto());
		} catch (Exception e) {
			System.out.println("Error updateContactoTest: " + e);
		}
	}

	@Test
	public void updateTelefono() {
		try {
			System.out.println("UpdateNumber");
			clienteService.updateTelefono(this.cliente.getId(), "192929929");
			Cliente c = clienteService.read(this.cliente.getId());
			assertNotEquals(c.getTelefono(), this.cliente.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateTelefonoTest: " + e);
		}
	}

	@Test
	public void updateEmail() {
		try {
			System.out.println("UpdateEmail");
			clienteService.updateEmail(this.cliente.getId(), "ajsknas@hotmail.com");
			Cliente c = clienteService.read(this.cliente.getId());
			assertNotEquals(c.getEmail(), this.cliente.getTelefono());
		} catch (Exception e) {
			System.out.println("Error updateEmailTest: " + e);
		}
	}

	@Test
	public void updateRfc() {
		try {
			System.out.println("UpdateRfc");
			clienteService.updateRfc(this.cliente.getId(), "KWUBEUW8B38DNW");
			Cliente c = clienteService.read(this.cliente.getId());
			assertNotEquals(c.getRfc(), this.cliente.getRfc());
		} catch (Exception e) {
			System.out.println("Error updateRfcTest: " + e);
		}
	}
}
