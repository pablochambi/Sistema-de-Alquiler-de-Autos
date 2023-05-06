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
		assertEquals((Integer)1,ag.cantDeGarajesDisponibles() );
		
	}
	
	@Test
	public void queSePuedaRegistrarUnAutoEnUnaAgencia() {
		//Preparacion de datos
		String razonSocial="Rodriguez y cia S.R.L";
		Integer cuit=250686778;
		Agencia ag = new Agencia(razonSocial,cuit);
		
		Integer idGaraje=1;
		String direccion="Av. Victoria 123";
		Integer espaciosDisponibles=10;
		Garaje garaje1 = new Garaje(idGaraje, direccion, espaciosDisponibles);
		
		String patente = "USD 660";
		String marca = "Renauld kwid";
		String modelo = "Climber";
		Double precioPorDia = 8000.0;
		Auto auto1 = new Auto(patente, marca, modelo, precioPorDia);
		//Ejecuciones
		ag.registrarUnGaraje(garaje1);
		Boolean exitoso = ag.registrarUnAuto(auto1,garaje1);
		//Validaciones
		assertTrue(exitoso);
		assertEquals((Integer)1, ag.cantidaDeAutosDisponibles());
		assertEquals("USD 660", ag.getAutos().get(0).getPatente());
		
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
