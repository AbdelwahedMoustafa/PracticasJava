package repositorio;

import java.util.List;

import modelo.Cliente;

public class EjemploRespositorio {
	
		public static void main(String[] args) {
			OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
			repo.crear(new Cliente("Juan", "Perez"));
			repo.crear(new Cliente("Pame", "Gonzales"));
			repo.crear(new Cliente("Lucy", "Martinez"));
			repo.crear(new Cliente("Andres", "Suarez"));
			
			List<Cliente> clientes = repo.listar();
			clientes.forEach(System.out::println);
			System.out.println("================ Paginable ================");
			List<Cliente> paginable = repo.listar(0, 3);
			paginable.forEach(System.out::println);
			
			System.out.println("================ Ordenable ================");
			List<Cliente> clienteOrdenAsc = repo.listar("apellido", Direccion.DESC);
			for(Cliente c: clienteOrdenAsc) {
				System.out.println(c);
			}
				System.out.println("================ Editar ================");
				Cliente pameActualizar = new Cliente("Pamela", "Gonzales");
				pameActualizar.setId(2);
				repo.editar(pameActualizar);
				
				Cliente pame = repo.porId(2);
				System.out.println(pame);
				
				System.out.println("================ Listar la edicion ================");
				repo.listar("id", Direccion.ASC).forEach(System.out::println);
				
				System.out.println("================ Eliminar ================");
				repo.eliminar(2);
				repo.listar("id", Direccion.ASC).forEach(System.out::println);
				
	}
	

	
}
