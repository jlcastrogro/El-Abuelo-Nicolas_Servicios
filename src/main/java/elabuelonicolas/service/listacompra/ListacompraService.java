package elabuelonicolas.service.listacompra;

import java.util.List;
import elabuelonicolas.bd.domain.Listacompra;
 
public interface ListacompraService {
	List<Listacompra> findAll();

	void create(Listacompra lc);

	Listacompra read(int id); 

	void update(Listacompra lc);

	void delete(int id);

}
