package ar.edu.unlam.pb2.sistemaAlquilerAutos;

import java.util.ArrayList;

public class Agencia {

	private String razonSocial;
	private Integer cuit;
	private ArrayList<Garaje> garajes = new ArrayList<>();
	private ArrayList<Auto> autos = new ArrayList<>();
	private ArrayList<Cliente> clientes = new ArrayList<>();
	
	
	
	public Agencia(String razonSocial, Integer cuit) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		garajes = new ArrayList<>();
		autos = new ArrayList<>();
		clientes = new ArrayList<>();
	}



	public Agencia(String razonSocial,Integer cuit, ArrayList<Garaje> garajes, 
													 ArrayList<Auto> autos) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.garajes = garajes;
		this.autos = autos;
		clientes = new ArrayList<>();
	}
	
	public boolean registrarUnGaraje(Garaje garaje) {
		return this.garajes.add(garaje);
	}



	public Boolean registrarUnAuto(Auto auto1, Garaje garaje1) {
		
		if(garaje1.agregarAuto(auto1)) {
			
			auto1.setGaraje(garaje1);
			return this.autos.add(auto1);
		}
			
		return false;
		
	}



	public String getRazonSocial() {
		return razonSocial;
	}



	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}



	public Integer getCuit() {
		return cuit;
	}



	public void setCuit(Integer cuit) {
		this.cuit = cuit;
	}



	public ArrayList<Garaje> getGarajes() {
		return garajes;
	}



	public void setGarajes(ArrayList<Garaje> garajes) {
		this.garajes = garajes;
	}



	public ArrayList<Auto> getAutos() {
		return autos;
	}



	public void setAutos(ArrayList<Auto> autos) {
		this.autos = autos;
	}



	public ArrayList<Cliente> getClientes() {
		return clientes;
	}



	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}



	public Integer cantidaDeAutosDisponibles() {
		return this.autos.size();
	}



	public Integer cantDeGarajesDisponibles() {
		return this.garajes.size();
	}
	
	
	
}
