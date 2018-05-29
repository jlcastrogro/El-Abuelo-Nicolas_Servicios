package elabuelonicolas.service; 

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Listaventa;
import elabuelonicolas.service.listaventa.ListaventaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ListaventaServiceImplTest {

	@Inject
	ListaventaService listaventaService;
	
	@Test
	public void findAll() {
		try {
			List<Listaventa> list = listaventaService.findAll();
			System.out.println("Find All Lista Venta Service");
			for (Listaventa lv: list) {
				System.out.println("Id Producto: " + lv.getIdproducto());
				System.out.println("Cantidad : " + lv.getCantidad());
				System.out.println("Subtotal: " + lv.getSubtotal());
				System.out.println("Id Venta: " + lv.getIdventa());
			}
		}catch (Exception e) {
			System.out.println("Error findAll (ListaventaServiceImplTest.java): " + e);
		}
	}
	
	@Test 
	public void createListaventa() {
		Listaventa lv = new Listaventa();
		try {
			lv.setIdproducto(1);
			lv.setCantidad(250);
			lv.setSubtotal(345.53);
			lv.setIdventa(2);
		}catch (Exception e) {
			System.out.println("Error create (ListaventaServiceImplTest.java): " + e);
		}
	}
	
	@Test
	public void readListaventa() {
		try {
			Listaventa lv = listaventaService.read(1);
			System.out.println("Id Producto: " + lv.getIdproducto());
			System.out.println("Cantidad : " + lv.getCantidad());
			System.out.println("Subtotal: " + lv.getSubtotal());
			System.out.println("Id Venta: " + lv.getIdventa());
		}catch (Exception e) {
			System.out.println("Error Read (ListaventaServiceImplTest.java): " + e);
		}
	}
	
	@Test
	public void updateListaventa() {
		Listaventa lv = listaventaService.read(2);
		try {
			lv.setIdproducto(90);
			lv.setCantidad(900);
			lv.setSubtotal(900.99);
			lv.setIdventa(90);
		}catch(Exception e) {
			System.out.println("Error Update (ListaventaServiceImplTes.java): " + e);
		}
	}
	
	@Test
	public void delete() {
		try {
			listaventaService.delete(6);
			System.out.println("Delete Lista Ventas");
		}catch (Exception e) {
			System.out.println("Error Delete (ListavetnasServiceImplTest): " + e);
		}
	}
}
