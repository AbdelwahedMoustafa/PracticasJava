package repositorio;

import java.util.List;

import modelo.Cliente;

public interface CrudRepositorio<T> {
	List<T> listar();
	T porId(Integer id);
	void crear(T cliente);
	void editar(T cliente);
	void eliminar(Integer id);
	 
	
}
