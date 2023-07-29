package repositorio;

import java.util.List;

import modelo.Cliente;

public interface PaginableRepositorio<T> {

	List<T> listar(int desde, int hasta);
}
