package elabuelonicolas.service.listacompras;

import java.util.List;
import elabuelonicolas.bd.domain.Listacompras;
 
public interface ListacomprasService {
	List<Listacompras> findAll();

	void create(Listacompras lc);

	Listacompras read(int id); 

	void update(Listacompras lc);

	void delete(int id);

}
