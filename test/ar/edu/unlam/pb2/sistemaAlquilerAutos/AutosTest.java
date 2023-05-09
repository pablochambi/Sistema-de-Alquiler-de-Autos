package ar.edu.unlam.pb2.sistemaAlquilerAutos;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.Assert;

public class AutosTest {

	@Test
	public void queNoSePuedaAgregarAutosConLaMismaPatente() {
	    // Crear el garaje y agregar un auto con patente X
	    Garaje garaje = new Garaje(1, "Av. Victoria 123", 10);
	    Auto auto1 = new Auto("AD 115 PX", "Volkswagen", "Suran 2016", 4500.0);
	    garaje.agregarAuto(auto1);
	    
	    // Crear otro auto con misma patente
	    Auto auto2 = new Auto("AD 115 PX", "Peugeot", "208 2020", 5000.0);
	    
	    // Intentar agregar otro auto con la misma patente
	    boolean seAgrego = garaje.agregarAuto(auto2);
	    
	    // Verificar
	    assertFalse(seAgrego);
	    assertEquals(1, garaje.getAutosEnElGaraje().size());
	    
	}
		
	@Test
	public void queSePuedaRegistrarAutosEnUnGaraje() {
		String patente = "AD 115 PX";
		String marca = "Volkswagen";
		String modelo = "Suran 2016";
		Double precioPorDia = 4500.0;
		Auto auto = new Auto(patente, marca, modelo, precioPorDia);

		Integer idGaraje = 1;
		String direccion = "Av. Victoria 123";
		Integer espaciosDisponibles = 10;
		Garaje garaje = new Garaje(idGaraje, direccion, espaciosDisponibles);

		garaje.registrarAuto(auto);

		ArrayList<Auto> autosEnElGaraje = garaje.getAutosEnElGaraje();
		assertTrue(autosEnElGaraje.contains(auto));
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
