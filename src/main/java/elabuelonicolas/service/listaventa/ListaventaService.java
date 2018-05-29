package elabuelonicolas.service.listaventa; 

import java.util.List;

import elabuelonicolas.bd.domain.Listaventa;

public interface ListaventaService {

	List<Listaventa> findAll();

	void create(Listaventa listaventas);

	Listaventa read(int id);

	void update(Listaventa listaventas);

	void delete(int id);
}