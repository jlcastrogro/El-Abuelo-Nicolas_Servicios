package elabuelonicolas.service.direccion;

import static org.junit.Assert.assertNotEquals;
import javax.inject.Inject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import elabuelonicolas.bd.domain.Direccion;
import elabuelonicolas.dao.direccion.DireccionDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class UpdateTest {
	@Inject
	DireccionDao direccionDao;
	private Direccion direccion;

	@Before
	public void setUp() {
		this.direccion = new Direccion();
		this.direccion.setPais("EUA");
		this.direccion.setNumero(5);
		this.direccion.setCiudad("NY");
		this.direccion.setColonia("NY");
		this.direccion.setCalle("NY");
		this.direccion.setEstado("NY");
		direccionDao.create(this.direccion);

		this.direccion.setId(direccionDao.last().getId());
	}

	@After
	public void tearDown() {
		direccionDao.delete(this.direccion.getId());
	}

	@Test
	public void update() {
		Direccion d = direccionDao.read(this.direccion.getId());
		try {
			System.out.println("Update");
			d.setPais("Mexico");
			d.setNumero(8);
			d.setEstado("Puebla");
			d.setCiudad("Acatlan");
			d.setColonia("San Rafael");
			d.setCalle("San Juan");
			direccionDao.update(d);
		} catch (Exception e) {
			System.out.println("Error updateTest: " + e);
		}

		assertNotEquals(this.direccion.getPais(), d.getPais());
		assertNotEquals(this.direccion.getNumero(), d.getNumero());
		assertNotEquals(this.direccion.getEstado(), d.getEstado());
		assertNotEquals(this.direccion.getCiudad(), d.getCiudad());
		assertNotEquals(this.direccion.getColonia(), d.getColonia());
		assertNotEquals(this.direccion.getCalle(), d.getCalle());
	}

	@Test
	public void updatePais() {
		try {
			System.out.println("UpdatePais");
			direccionDao.updatePais(this.direccion.getId(), "México");
			Direccion d = direccionDao.read(this.direccion.getId());
			assertNotEquals(d.getPais(), this.direccion.getPais());
		} catch (Exception e) {
			System.out.println("Error updatePaisTest: " + e);
		}
	}

	@Test
	public void updateEstado() {
		try {
			System.out.println("UpdateEstado");
			direccionDao.updateEstado(this.direccion.getId(), "NM");
			Direccion d = direccionDao.read(this.direccion.getId());
			assertNotEquals(d.getEstado(), this.direccion.getEstado());
		} catch (Exception e) {
			System.out.println("Error updateContactoTest: " + e);
		}
	}

	@Test
	public void updateCiudad() {
		try {
			System.out.println("UpdateCiudad");
			direccionDao.updateCiudad(this.direccion.getId(), "NM");
			Direccion d = direccionDao.read(this.direccion.getId());
			assertNotEquals(d.getCiudad(), this.direccion.getCiudad());
		} catch (Exception e) {
			System.out.println("Error updateTelefonoTest: " + e);
		}
	}

	@Test
	public void updateColonia() {
		try {
			System.out.println("UpdateColonia");
			direccionDao.updateColonia(this.direccion.getId(), "NM");
			Direccion d = direccionDao.read(this.direccion.getId());
			assertNotEquals(d.getColonia(), this.direccion.getColonia());
		} catch (Exception e) {
			System.out.println("Error updateEmailTest: " + e);
		}
	}

	@Test
	public void updateCalle() {
		try {
			System.out.println("UpdateCalle");
			direccionDao.updateCalle(this.direccion.getId(), "S/C");
			Direccion d = direccionDao.read(this.direccion.getId());
			assertNotEquals(d.getCalle(), this.direccion.getCalle());
		} catch (Exception e) {
			System.out.println("Error updateRfcTest: " + e);
		}
	}
}
