package elabuelonicolas.service;

import java.sql.Date;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Compra;
import elabuelonicolas.service.compra.CompraService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })

public class CompraServiceImplTest {
	@Inject 
	CompraService compraService;

	@Test
	public void findAll() {
		try {
			List<Compra> lista = compraService.findAll();
			System.out.println("FindAll");
			for (Compra c : lista) {
				System.out.println("Id: " + c.getId());
				System.out.println("ID proveedor: " + c.getIdproveedor());
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void createCompra() {
		Compra c = new Compra();
		try {
			c.setIdproveedor(1);
			c.setFecha(new Date(2018, 1, 1));
			c.setTotal(100.10);
			compraService.create(c);
			System.out.println("Create");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Test
	public void readCompra() {
		try { 
			Compra c = compraService.read(4);
			System.out.println(c.getId());
			System.out.println(c.getIdproveedor());
			System.out.println("Read");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void updateCompra() {
		Compra c = compraService.read(5);
		try {
			c.setIdproveedor(4);
			c.setFecha(new Date(2018, 1, 1));
			c.setTotal(100.10);
			compraService.update(c);
			System.out.println("Update");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Test
	public void deleteCompra() {
		try {
			if (compraService.read(1) != null)
				compraService.delete(1);
			System.out.println("Delete");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}

}
