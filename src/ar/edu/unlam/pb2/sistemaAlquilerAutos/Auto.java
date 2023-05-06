package ar.edu.unlam.pb2.sistemaAlquilerAutos;

public class Auto {
	
	private String patente;
	private String marca;
	private String modelo;
	private Double precioPorDia;
	private Garaje garaje;
	
	
	
	public Auto(String patente, String marca, String modelo, Double precioPorDia) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.precioPorDia = precioPorDia;
	}

	public Auto(String patente, String marca, String modelo, Double precioPorDia, Garaje garaje) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.precioPorDia = precioPorDia;
		this.garaje = garaje;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecioPorDia() {
		return precioPorDia;
	}

	public void setPrecioPorDia(Double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	public Garaje getGaraje() {
		return garaje;
	}

	public void setGaraje(Garaje garaje) {
		this.garaje = garaje;
	}
	
	
	
	
}