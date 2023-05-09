package ar.edu.unlam.pb2.sistemaAlquilerAutos;

public class Cliente {
	private Integer dni; 
	private String apellidoNombre;
	private String direccion;
	private Integer telefono;
	private Boolean esVip;
	
	public Cliente(Integer dni, String apellidoNombre, String direccion, Integer telefono) {
		this.dni = dni;
		this.apellidoNombre = apellidoNombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.esVip = false;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellidoNombre() {
		return apellidoNombre;
	}

	public void setApellidoNombre(String apellidoNombre) {
		this.apellidoNombre = apellidoNombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono =telefono ;
	}

	public Boolean getEsVip() {
		return esVip;
	}

	public void setEsVip(Boolean esVip) {
		this.esVip = esVip;
	}
	
	
	
	
	
	
}
