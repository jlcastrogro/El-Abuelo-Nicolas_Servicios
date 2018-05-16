package elabuelonicolas.service.compras;

import java.util.List;
import elabuelonicolas.bd.domain.Compras;

public interface ComprasService {
	List<Compras> findAll();

	void create(Compras compra);

	Compras read(int id);

	void update(Compras compra);

	void delete(int id);
}
