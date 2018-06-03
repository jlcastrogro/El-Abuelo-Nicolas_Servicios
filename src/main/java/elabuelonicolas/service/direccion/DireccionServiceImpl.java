package elabuelonicolas.service.direccion;

import java.util.List;
import javax.inject.Named;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import elabuelonicolas.bd.domain.Direccion;
import elabuelonicolas.bd.mappers.DireccionMapper;

@Named
public class DireccionServiceImpl implements DireccionService {
	
	SqlSession sqlSession;

	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Direccion> findAll() {
		List<Direccion> list = null;
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			list = direccionMapper.findAll();
			return list;
		} catch (Exception e) {
			System.out.println("Error findAll: " + e);
		}
		return null;
	}

	@Override
	public void create(Direccion direccion) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.create(direccion);
		} catch (Exception e) {
			System.out.println("Error create: " + e);
		}
	}

	@Override
	public Direccion read(int id) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			Direccion direccion = direccionMapper.read(id);
			return direccion;
		} catch (Exception e) {
			System.out.println("Error read: " + e);
		}
		return null;
	}
	
	@Override
	public List<Direccion> readByPais(String pais) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			return direccionMapper.readByPais(pais);
		} catch (Exception e) {
			System.out.println("Error readByPais: " + e);
		}
		return null;
	}
	
	@Override
	public List<Direccion> readByEstado(String estado) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			return direccionMapper.readByEstado(estado);
		} catch (Exception e) {
			System.out.println("Error readByEstado: " + e);
		}
		return null;
	}
	
	@Override
	public List<Direccion> readByCiudad(String ciudad) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			return direccionMapper.readByCiudad(ciudad);
		} catch (Exception e) {
			System.out.println("Error readByCiudad: " + e);
		}
		return null;
	}
	
	@Override
	public List<Direccion> readByColonia(String colonia) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			return direccionMapper.readByColonia(colonia);
		} catch (Exception e) {
			System.out.println("Error readByDireccion: " + e);
		}
		return null;
	}
	
	@Override
	public List<Direccion> readByCalle(String calle) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			return direccionMapper.readByCalle(calle);
		} catch (Exception e) {
			System.out.println("Error readByDireccion: " + e);
		}
		return null;
	}
	
	@Override
	public Direccion readByNumero(int numero) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			return direccionMapper.readByNumero(numero);
		}catch(Exception e) {
			System.out.println("Error readByDireccion: " + e);
		}
		return null;
	}
	/*public Direccion readByNumero(int numero) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			return direccionMapper.readByNumero(numero);
		} catch (Exception e) {
			System.out.println("Error readByDireccion: " + e);
		}
		return null;
	}*/

	@Override
	public void update(Direccion direccion) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.update(direccion);
		} catch (Exception e) {
			System.out.println("Error update: " + e);
		}
	}
	
	@Override
	public void updateEstado(int id, String estado) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.updateEstado(id, estado);
		} catch (Exception e) {
			System.out.println("Error updateEstado: " + e);
		}
	}

	@Override
	public void updateCiudad(int id, String ciudad) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.updateCiudad(id, ciudad);
		} catch (Exception e) {
			System.out.println("Error updatePais: " + e);
		}
	}
	
	@Override
	public void updateColonia(int id, String colonia) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.updateColonia(id, colonia);
		} catch (Exception e) {
			System.out.println("Error updateColonia: " + e);
		}
	}
	
	@Override
	public void updateCalle(int id, String calle) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.updateCalle(id, calle);
		} catch (Exception e) {
			System.out.println("Error updatePais: " + e);
		}
	}
	
	@Override
	public void updateNumero(int id, int numero) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.updateNumero(id, numero);
		} catch (Exception e) {
			System.out.println("Error updatePais: " + e);
		}
	}
	
	@Override
	public void updatePais(int id, String pais) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.updatePais(id, pais);
		} catch (Exception e) {
			System.out.println("Error updatePais: " + e);
		}
	}
	
	@Override
	public void delete(int id) {
		try {
			DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
			direccionMapper.delete(id);
		} catch (Exception e) {
			System.out.println("Error delete: " + e);
		}
	}
	
	@Override
	public Direccion last() {
		DireccionMapper direccionMapper = sqlSession.getMapper(DireccionMapper.class);
		return direccionMapper.last();
	}
}
