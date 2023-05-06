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
	
}
