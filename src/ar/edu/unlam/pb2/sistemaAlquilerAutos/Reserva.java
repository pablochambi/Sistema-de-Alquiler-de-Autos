package ar.edu.unlam.pb2.sistemaAlquilerAutos;

public class Reserva {
	private Integer codReserva;
	private Cliente cliente;
	private Auto auto;
	private Integer dias;
	private Double precioTotal;
	
	public Reserva(Integer codReserva, Cliente cliente, Auto auto,Integer dias) {
		this.codReserva = codReserva;
		this.cliente = cliente;
		this.auto = auto;
		this.dias = dias;
		this.precioTotal = auto.getPrecioPorDia()*dias;
		
	}

	public Integer getCodReserva() {
		return codReserva;
	}

	public void setCodReserva(Integer codReserva) {
		this.codReserva = codReserva;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Double getPrecioTotal() {
		return this.precioTotal;
	}

	public Double cambiarPrecio(Double descuento) {
		// TODO Auto-generated method stub
		return this.precioTotal*descuento;
	}

	
	
	
	
}
