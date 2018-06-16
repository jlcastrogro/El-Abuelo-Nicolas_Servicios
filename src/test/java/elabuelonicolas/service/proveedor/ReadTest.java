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
			System.out.println("Error readProveedorTest: " + e);
		}
	}

	@Test
	public void readByNombre() {
		try {
			List<Proveedor> proveedor = proveedorService.readByNombre("Aurrera");
			assertEquals(proveedor.get(0).getNombre(), "Aurrera");
		} catch (Exception e) {
			System.out.println("Error readProveedorByNombreTest: " + e);
		}
	}

	@Test
	public void readByContacto() {
		try {
			List<Proveedor> proveedor = proveedorService.readByContacto("José Luis");
			assertEquals(proveedor.get(0).getContacto(), "José Luis");
		} catch (Exception e) {
			System.out.println("Error readProveedorByContactoTest: " + e);
		}
	}

	@Test
	public void readByTelefono() {
		try {
			Proveedor proveedor = proveedorService.readByTelefono("9535362391");
			assertEquals(proveedor.getTelefono(), "9535362391");
		} catch (Exception e) {
			System.out.println("Error readProveedorByTelefonoTest: " + e);
		}
	}

	@Test
	public void readByEmail() {
		try {
			Proveedor proveedor = proveedorService.readByEmail("contacto@aurrera.com");
			assertEquals(proveedor.getEmail(), "contacto@aurrera.com");
		} catch (Exception e) {
			System.out.println("Error readProveedorByEmailTest: " + e);
		}
	}

	@Test
	public void readByRfc() {
		try {
			Proveedor proveedor = proveedorService.readByRfc("928HEND938HDNOWIN");
			assertEquals(proveedor.getRfc(), "928HEND938HDNOWIN");
		} catch (Exception e) {
			System.out.println("Error readProveedorByRfcTest: " + e);
		}
	}
}
