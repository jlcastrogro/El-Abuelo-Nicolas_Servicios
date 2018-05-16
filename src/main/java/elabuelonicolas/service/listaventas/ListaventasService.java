package elabuelonicolas.service.listaventas;

import java.util.List;

import elabuelonicolas.bd.domain.Listaventas;

public interface ListaventasService {

	List<Listaventas> findAll();

	void create(Listaventas listaventas);

	Listaventas read(int id);

	void update(Listaventas listaventas);

	void delete(int id);
}