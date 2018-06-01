package elabuelonicolas.service; 

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Venta;
import elabuelonicolas.service.venta.VentaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class VentaServiceImplTest {
	@Inject
	VentaService ventaService;

	@Test
	public void findAll() {
		try {
			List<Venta> lista = ventaService.findAll();
			System.out.println("FindAll");
			for (Venta v : lista) {
				System.out.println("Id Cliente: " + v.getIdcliente());
				System.out.println("Fecha: " + v.getFecha());
				System.out.println("Precio Total: " + v.getTotal());
			}
		} catch (Exception e) {
			System.out.println("Error findAll (VentaServiceImplTest.java): " + e);
		}
	}
	
	@Test
	public void createVenta() {
		Venta v = new Venta();
		
		try {
			v.setIdcliente(1);
			v.setFecha(null);
			v.setTotal(3200.40);
		} catch(Exception e) {
			System.out.println("Error create (VentaServiceImplTest): " + e);
		}
	}
	
	@Test
	public void readVenta() {
		try {
			Venta v = ventaService.read(1);
			System.out.println("Id Cliente: " + v.getIdcliente());
			System.out.println("Id Fecha: " + v.getFecha());
			System.out.println("Id Precio Total: " + v.getTotal());
		}catch(Exception e) {
			System.out.println("Error read (VentaServiceImplTest): " + e);
		}
	}

	@Test
	public void updateVenta() {
		Venta v = ventaService.read(2);
		try {
			v.setIdcliente(90);
			v.setFecha(null);
			v.setTotal(9.99);
		}catch (Exception e) {
			System.out.println("Error Update (VentaServiceImplTest): " + e);
		}
	}
	
	@Test
	public void deleteVenta() {
		try {
			ventaService.delete(5);
			System.out.println("Delete Venta");
		}catch(Exception e) {
			System.out.println("Error Delete (VentaServiceImplTest): " + e);
		}
	}
	
}
