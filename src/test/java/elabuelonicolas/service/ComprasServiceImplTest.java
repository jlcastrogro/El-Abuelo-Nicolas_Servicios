package elabuelonicolas.service;

import java.sql.Date;
import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Compras;
import elabuelonicolas.service.compras.ComprasService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })

public class ComprasServiceImplTest {
	@Inject
	ComprasService compraService;

	@Test
	public void findAll() {
		try {
			List<Compras> lista = compraService.findAll();
			System.out.println("FindAll");
			for (Compras c : lista) {
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
	public void createCompras() {
		Compras c = new Compras();
		try {
			c.setIdproveedor(1);
			c.setIdlistacompra(1);
			c.setFecha(new Date(2018, 1, 1));
			c.setPreciototal(100.10);
			compraService.create(c);
			System.out.println("Create");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Test
	public void readCompras() {
		try { 
			Compras c = compraService.read(9);
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
	public void updateCompras() {
		Compras c = compraService.read(10);
		try {
			c.setIdproveedor(4);
			c.setIdlistacompra(1);
			c.setFecha(new Date(2018, 1, 1));
			c.setPreciototal(100.10);
			compraService.update(c);
			System.out.println("Update");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}

	@Test
	public void deleteCompras() {
		try {
			if (compraService.read(5) != null)
				compraService.delete(2);
			System.out.println("Delete");
			System.out.println();
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}

}
