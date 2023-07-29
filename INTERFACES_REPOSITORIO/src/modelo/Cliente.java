package modelo;

import java.util.Objects;

public class Cliente extends BaseEntity{
	private Integer id;
	private String nombre, apellido;
	private static int ultimoId;
	
	
	public Cliente() {
		this.id = ++ultimoId;
	}

	public Cliente(String nombre, String apellido) {
		this();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Integer getId() {   //mostrar
		return id;
	}

	public void setId(Integer id) {   //modificar
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "id=" + id +
				", nombre=" + nombre + '\'' +
				", apellido=" + apellido + '\'';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Cliente cliente = (Cliente) o;
		return Objects.equals(id, cliente.id);
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	
	
}
