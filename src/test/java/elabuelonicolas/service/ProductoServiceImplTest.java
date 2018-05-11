package elabuelonicolas.service;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Producto;
import elabuelonicolas.service.producto.ProductoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class ProductoServiceImplTest {
	@Inject
	ProductoService productoService;

	@Test
	public void findAll() {
		try {
			List<Producto> lista = productoService.findAll();
			System.out.println("FinAll");
			for (Producto c : lista) {
				System.out.println("Id: " + c.getId());
				System.out.println("Nombre: " + c.getTipo());
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
	}

	@Test
	public void createProducto() {
		Producto c = new Producto();
		try {
			c.setTipo("Balón");
			c.setMarca("Puma");
			c.setCosto("$120");
			c.setExistencia(3);
			productoService.create(c);
			System.out.println("Create");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Test
	public void readProducto() {
		try {
			Producto c = productoService.read(1);
			System.out.println("Id: " + c.getId());
			System.out.println("Tipo: " + c.getTipo());
			System.out.println("Existencia: " + c.getExistencia());
			System.out.println("Read");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@Test
	public void updateProducto() {
		Producto c = productoService.read(3);
		try {
			c.setTipo("Balón");
			c.setMarca("Nike");
			c.setCosto("$180");
			c.setExistencia(1);
			productoService.update(c);
			System.out.println("Update");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Test
	public void deleteProducto() {
		try {
			productoService.delete(3);
			System.out.println("Delete");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
}