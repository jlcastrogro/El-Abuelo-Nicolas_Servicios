package elabuelonicolas.service.proveedor;

import static org.junit.Assert.assertEquals;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Proveedor;
import elabuelonicolas.service.proveedor.ProveedorService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ReadTest {
	@Inject
	ProveedorService proveedorService;

	@Test
	public void read() {
		try {
			Proveedor p = proveedorService.read(1);
			assertEquals((int) p.getId(), 1);
		} catch (Exception e) {
			System.out.println("Error readTest: " + e);
		}
	}

	@Test
	public void readByNombre() {
		try {
			List<Proveedor> proveedor = proveedorService.readByNombre("José Luis");
			assertEquals(proveedor.get(0).getNombre(), "José Luis");
		} catch (Exception e) {
			System.out.println("Error readByNombreTest: " + e);
		}
	}

	@Test
	public void readByDireccion() {
		try {
			Proveedor proveedor = proveedorService.readByDireccion(1);
			assertEquals((int) proveedor.getIddireccion(), 1);
		} catch (Exception e) {
			System.out.println("Error readByDireccionTest: " + e);
		}
	}

	@Test
	public void readByContacto() {
		try {
			List<Proveedor> proveedor = proveedorService.readByContacto("Nicolás");
			assertEquals(proveedor.get(0).getContacto(), "Nicolás");
		} catch (Exception e) {
			System.out.println("Error readByContactoTest: " + e);
		}
	}

	@Test
	public void readByTelefono() {
		try {
			List<Proveedor> proveedor = proveedorService.readByTelefono("351354343");
			assertEquals(proveedor.get(0).getTelefono(), "351354343");
		} catch (Exception e) {
			System.out.println("Error readByTelefonoTest: " + e);
		}
	}

	@Test
	public void readByEmail() {
		try {
			List<Proveedor> proveedor = proveedorService.readByEmail("josejaime@gmail.com");
			assertEquals(proveedor.get(0).getEmail(), "josejaime@gmail.com");
		} catch (Exception e) {
			System.out.println("Error readByEmailTest: " + e);
		}
	}

	@Test
	public void readByRfc() {
		try {
			List<Proveedor> proveedor = proveedorService.readByRfc("UHS2K28HJ3N3");
			assertEquals(proveedor.get(0).getRfc(), "UHS2K28HJ3N3");
		} catch (Exception e) {
			System.out.println("Error readByRfcTest: " + e);
		}
	}
}
