package ar.edu.unlam.pb2.sistemaAlquilerAutos;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgenciaTest {

	@Test
	public void queSePuedaRegistrarUnGarajeAUnaAgencia() {
		
		Agencia ag = new Agencia("Rodriguez y cia S.R.L", 250686778);
		
		Garaje g1 = new Garaje("Av. Victoria 123","A1");
		
		Boolean exitoso = ag.registrarUnGaraje(g1);
		
	}
	
	@Test
	public void queSePuedaRegistrarUnAutoEnUnaAgencia() {
		
		Agencia ag = new Agencia("Rodriguez y cia S.R.L", 250686778);
		
		Garaje g1 = new Garaje("Av. Victoria 123","A1");
		
		Boolean exitoso = ag.registrarUnGaraje(g1);
		
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
