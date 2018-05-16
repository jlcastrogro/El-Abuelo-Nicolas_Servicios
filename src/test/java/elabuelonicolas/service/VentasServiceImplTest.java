package elabuelonicolas.service;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Ventas;
import elabuelonicolas.service.ventas.VentasService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class VentasServiceImplTest {
	@Inject
	VentasService ventasService;

	@Test
	public void findAll() {
		try {
			List<Ventas> lista = ventasService.findAll();
			System.out.println("FindAll");
			for (Ventas v : lista) {
				System.out.println("Id Cliente: " + v.getIdcliente());
				System.out.println("Id Lista Venta: " + v.getIdlistaventa());
				System.out.println("Fecha: " + v.getFecha());
				System.out.println("Precio Total: " + v.getPreciototal());
			}
		} catch (Exception e) {
			System.out.println("Error findAll (VentasServiceImplTest.java): " + e);
		}
	}
	
	@Test
	public void createVentas() {
		Ventas v = new Ventas();
		
		try {
			v.setIdcliente(1);
			v.setIdlistaventa(2);
			v.setFecha(null);
			v.setPreciototal(3200.40);
		} catch(Exception e) {
			System.out.println("Error create (VentasServiceImplTest): " + e);
		}
	}
	
	@Test
	public void readVentas() {
		try {
			Ventas v = ventasService.read(1);
			System.out.println("Id Cliente: " + v.getIdcliente());
			System.out.println("Id Lista Ventas: " + v.getIdlistaventa());
			System.out.println("Id Fecha: " + v.getFecha());
			System.out.println("Id Precio Total: " + v.getPreciototal());
		}catch(Exception e) {
			System.out.println("Error read (VentasServiceImplTest): " + e);
		}
	}

	@Test
	public void updateVentas() {
		Ventas v = ventasService.read(2);
		try {
			v.setIdcliente(90);
			v.setIdlistaventa(90);
			v.setFecha(null);
			v.setPreciototal(9.99);
		}catch (Exception e) {
			System.out.println("Error Update (VentasServiceImplTest): " + e);
		}
	}
	
	@Test
	public void deleteVentas() {
		try {
			ventasService.delete(5);
			System.out.println("Delete Ventas");
		}catch(Exception e) {
			System.out.println("Error Delete (VentasServiceImplTest): " + e);
		}
	}
	
}
