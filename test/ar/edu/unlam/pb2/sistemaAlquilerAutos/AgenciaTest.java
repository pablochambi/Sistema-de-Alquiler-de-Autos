package ar.edu.unlam.pb2.sistemaAlquilerAutos;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgenciaTest {

	@Test
	public void queSePuedaRegistrarUnGarajeAUnaAgencia() {
		//Preparacion de datos
		String razonSocial="Rodriguez y cia S.R.L";
		Integer cuit=250686778;
		Agencia ag = new Agencia(razonSocial,cuit);
		
		Integer idGaraje=1;
		String direccion="Av. Victoria 123";
		Integer espaciosDisponibles=4;
		Garaje garaje1 = new Garaje(idGaraje, direccion, espaciosDisponibles);
		
		//Ejecuciones
		Boolean exitoso = ag.registrarUnGaraje(garaje1);
		//validaciones
		assertTrue(exitoso);
		
	}
	
	@Test
	public void queSePuedaRegistrarUnAutoEnUnaAgencia() {
		
		String razonSocial="Rodriguez y cia S.R.L";
		Integer cuit=250686778;
		Agencia ag = new Agencia(razonSocial,cuit);
		
		Integer idGaraje=1;
		String direccion="Av. Victoria 123";
		Integer espaciosDisponibles=4;
		Garaje garaje1 = new Garaje(idGaraje, direccion, espaciosDisponibles);
		
		ag.registrarUnGaraje(garaje1);
		
		Auto auto1 = new Auto("USD", "Renauld kwid", "Climber",8000.0);
		
		Boolean exitoso = ag.registrarUnAuto(auto1,"Av. Victoria");
		
		assertTrue(exitoso);
		
	}	
	
	
	
	
	
	
///queSePuedaRegistrarUnGarajeAUnaAgencia
//	queSePuedaRegistrarUnAutoEnUnaAgencia()
//	queSePuedaRegistrarUnClienteEnUnaAgencia()
//	queSePuedaRegistrarUnaReservaEnUnaAgencia()
//	queSePuedaRegistrarUnGarajeEnUnaAgencia()
//	queSePuedaEliminarUnAuto()
//	queSePuedaCambiarElPrecioXDiaDeUnAuto()
//	queSePuedaCambiarDeGarajeUnAuto()
//	queSePuedaEliminarUnaReservaPorqueElClienteLoCancelo()


}
