package ar.edu.unlam.pb2.sistemaAlquilerAutos;

//import java.util.ArrayList;
import java.util.HashSet;

public class Agencia {

	private String razonSocial;
	private Integer cuit;
	private HashSet<Garaje> garajes ;	//Garajes disponibles
	private HashSet<Auto> autos ;		//Autos disponibles
	private HashSet<Cliente> clientes ;
	private HashSet<Reserva> reservas;
	
	
	
	public Agencia(String razonSocial, Integer cuit) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		garajes = new HashSet<>();
		autos = new HashSet<>();
		clientes = new HashSet<>();
		reservas = new HashSet<>();
	}



	public Agencia(String razonSocial,Integer cuit, HashSet<Garaje> garajes, 
													 HashSet<Auto> autos) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.garajes = garajes;
		this.autos = autos;
		clientes = new HashSet<>();
	}
	
	public boolean registrarUnGaraje(Garaje garaje) {
		return this.garajes.add(garaje);
	}



	public Boolean registrarUnAuto(Auto auto1, Garaje garaje1) {
		
		if(garaje1.agregarAuto(auto1)) {
			
			auto1.setGaraje(garaje1);
			return this.autos.add(auto1);
		}
		else {
			return false;
		}
			
		
	}
	
	public Reserva alquilarAuto(Integer codReserva,Cliente cliente, Auto auto,Integer dias) {
		
		Reserva reserva = new Reserva(codReserva, cliente, auto, dias);
        reservas.add(reserva);
        auto.reservar();
        autos.remove(auto);
        //auto.getGaraje().disminuirCantidadEspaciosDisponibles();//Hacer test de este
        return reserva;
	}

	public Reserva cancelarAuto() {
		Reserva reserva;
		return reserva = null;
	}
	public boolean cambiarDeGaraje(Auto auto) {
		// TODO Auto-generated method stub
		if(this.garajes.contains(auto)) {
			garajes.remove(auto);
		}
		return this.autos.add(auto);
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



	public HashSet<Garaje> getGarajes() {
		return garajes;
	}



	public void setGarajes(HashSet<Garaje> garajes) {
		this.garajes = garajes;
	}



	public HashSet<Auto> getAutos() {
		return this.autos;
	}



	public void setAutos(HashSet<Auto> autos) {
		this.autos = autos;
	}



	public HashSet<Cliente> getClientes() {
		return clientes;
	}



	public void setClientes(HashSet<Cliente> clientes) {
		this.clientes = clientes;
	}



	public Integer cantidaDeAutosDisponibles() {
		return this.autos.size();
	}



	public Integer cantDeGarajesDisponibles() {
		return this.garajes.size();
	}



	public Boolean elAutoEstaDisponible(Auto auto1) {
		return this.autos.contains(auto1);
	}


	
	
	
}
