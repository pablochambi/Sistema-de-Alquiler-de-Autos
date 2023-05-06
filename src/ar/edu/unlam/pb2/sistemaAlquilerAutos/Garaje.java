package ar.edu.unlam.pb2.sistemaAlquilerAutos;

public class Garaje {
	
	private String direccion;
	private String codUbicacion;
	
	
	public Garaje() {
		this.direccion = "\0";
		this.codUbicacion = "\0";
	}

	public Garaje(String direccion, String codUbicacion) {
		this.direccion = direccion;
		this.codUbicacion = codUbicacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodUbicacion() {
		return codUbicacion;
	}

	public void setCodUbicacion(String codUbicacion) {
		this.codUbicacion = codUbicacion;
	}
	
	
	

}
