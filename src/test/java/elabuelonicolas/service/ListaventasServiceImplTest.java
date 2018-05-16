package elabuelonicolas.service; 

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import elabuelonicolas.bd.domain.Listaventas;
import elabuelonicolas.service.listaventas.ListaventasService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ListaventasServiceImplTest {

	@Inject
	ListaventasService listaventasService;
	
	@Test
	public void findAll() {
		try {
			List<Listaventas> list = listaventasService.findAll();
			System.out.println("Find All Lista Venta Service");
			for (Listaventas lv: list) {
				System.out.println("Id Producto: " + lv.getIdproducto());
				System.out.println("Cantidad : " + lv.getCantidad());
				System.out.println("Subtotal: " + lv.getSubtotal());
				System.out.println("Id Venta: " + lv.getIdventa());
			}
		}catch (Exception e) {
			System.out.println("Error findAll (ListaventasServiceImplTest.java): " + e);
		}
	}
	
	@Test 
	public void createListaventas() {
		Listaventas lv = new Listaventas();
		try {
			lv.setIdproducto(1);
			lv.setCantidad(250);
			lv.setSubtotal(345.53);
			lv.setIdventa(2);
		}catch (Exception e) {
			System.out.println("Error create (ListaventasServiceImplTest.java): " + e);
		}
	}
	
	@Test
	public void readListaventas() {
		try {
			Listaventas lv = listaventasService.read(1);
			System.out.println("Id Producto: " + lv.getIdproducto());
			System.out.println("Cantidad : " + lv.getCantidad());
			System.out.println("Subtotal: " + lv.getSubtotal());
			System.out.println("Id Venta: " + lv.getIdventa());
		}catch (Exception e) {
			System.out.println("Error Read (ListaventasServiceImplTest.java): " + e);
		}
	}
	
	@Test
	public void updateListaventas() {
		Listaventas lv = listaventasService.read(2);
		try {
			lv.setIdproducto(90);
			lv.setCantidad(900);
			lv.setSubtotal(900.99);
			lv.setIdventa(90);
		}catch(Exception e) {
			System.out.println("Error Update (ListaventasServiceImplTes.java): " + e);
		}
	}
	
	@Test
	public void delete() {
		try {
			listaventasService.delete(6);
			System.out.println("Delete Lista Ventas");
		}catch (Exception e) {
			System.out.println("Error Delete (ListavetnasServiceImplTest): " + e);
		}
	}
}
