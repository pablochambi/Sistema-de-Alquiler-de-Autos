package ar.edu.unlam.pb2.sistemaAlquilerAutos;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;

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
	    assertEquals(2, garaje.getAutosEnElGaraje().size());
	    
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
	
	
	
	
	
	
	/*5 tests*/
	///queSePuedaRegistrarUnGarajeAUnaAgencia
		@Test
		public void queSePuedaRegistrarUnGarajeAUnaAgencia() {
			Integer idGaraje = 1;
			String direccion = "Av. Victoria 123";
			Integer espaciosDisponibles = 10;
			Garaje garaje = new Garaje(idGaraje, direccion, espaciosDisponibles);
			
			String sa = "sa";
			Integer cuit = 392829101;
			Agencia agencia = new Agencia(sa, cuit);
			
			boolean exitoso = agencia.registrarUnGaraje(garaje);
			assertTrue(exitoso);
		}
		
//		queSePuedaRegistrarUnAutoEnUnaAgencia()
		@Test
		public void queSePuedaRegistrarUnAutoAUnaAgencia() {
			String patente = "AD 115 PX";
			String marca = "Volkswagen";
			String modelo = "Suran 2016";
			Double precioPorDia = 4500.0;
			Auto auto = new Auto(patente, marca, modelo, precioPorDia);
			
			Integer idGaraje = 1;
			String direccion = "Av. Victoria 123";
			Integer espaciosDisponibles = 10;
			Garaje garaje = new Garaje(idGaraje, direccion, espaciosDisponibles);
			
			String sa = "sa";
			Integer cuit = 392829101;
			Agencia agencia = new Agencia(sa, cuit);
			
			boolean exitoso = agencia.registrarUnAuto(auto, garaje);
			assertTrue(exitoso);
		}
		
//		queSePuedaRegistrarUnClienteEnUnaAgencia()
		@Test
		public void queSePuedaRegistrarUnClienteEnUnaAgencia() {
			Cliente juan = new Cliente(111111, "Juan Perez", "Calle falsa 123", 1122334455);
			Integer dias = 15;
			
			String sa = "sa";
			Integer cuit = 392829101;
			Agencia agencia = new Agencia(sa, cuit);
			HashSet <Cliente> lista = new HashSet<>();
			agencia.setClientes(lista);
			assertNotNull(juan);
		}
		
//		queSePuedaRegistrarUnaReservaEnUnaAgencia()
		@Test
		public void queSePuedaRegistrarUnaReservaEnUnaAgencia() {
			String patente = "AD 115 PX";
			String marca = "Volkswagen";
			String modelo = "Suran 2016";
			Double precioPorDia = 4500.0;
			Auto auto = new Auto(patente, marca, modelo, precioPorDia);
			
			Integer codigo = 9999;
			Cliente juan = new Cliente(111111, "Juan Perez", "Calle falsa 123", 1122334455);
			Integer dias = 15;
			
			String sa = "sa";
			Integer cuit = 392829101;
			Agencia agencia = new Agencia(sa, cuit);
			
			Reserva reserva = new Reserva(codigo, juan, auto, dias);
			
			assertNotNull(agencia.alquilarAuto(codigo, juan, auto, dias));
		}
		
//		queSePuedaEliminarUnAuto()
		@Test
		public void queSePuedaEliminarUnAuto() {
			String patente = "AD 115 PX";
			String marca = "Volkswagen";
			String modelo = "Suran 2016";
			Double precioPorDia = 4500.0;
			Auto auto = new Auto(patente, marca, modelo, precioPorDia);
			
			Integer idGaraje = 1;
			String direccion = "Av. Victoria 123";
			Integer espaciosDisponibles = 10;
			Garaje garaje = new Garaje(idGaraje, direccion, espaciosDisponibles);
			
			String sa = "sa";
			Integer cuit = 392829101;
			Agencia agencia = new Agencia(sa, cuit);
			
			garaje.registrarAuto(auto);
			assertNotNull(garaje.getAutosEnElGaraje());
			garaje.eliminarAuto(auto);
			
			
		}
//		queSePuedaCambiarElPrecioXDiaDeUnAuto()
		@Test
		public void queSePuedaCambiarElPrecioXDiaDeUnAuto() {
			String patente = "AD 115 PX";
			String marca = "Volkswagen";
			String modelo = "Suran 2016";
			Double precioPorDia = 4500.0;
			Auto auto = new Auto(patente, marca, modelo, precioPorDia);
			
			Integer codigo = 9999;
			Cliente juan = new Cliente(111111, "Juan Perez", "Calle falsa 123", 1122334455);
			Integer dias = 15;
			
			Reserva reserva = new Reserva(codigo, juan, auto, dias);
			Double descuento = 0.90;
			Double cambiado =reserva.cambiarPrecio(descuento);
			assertNotNull(cambiado);
		}
		
//		queSePuedaCambiarDeGarajeUnAuto()
		@Test
		public void queSePuedaCambiarDeGarajeUnAuto() {
			String patente = "AD 115 PX";
			String marca = "Volkswagen";
			String modelo = "Suran 2016";
			Double precioPorDia = 4500.0;
			Auto auto = new Auto(patente, marca, modelo, precioPorDia);
			
			Integer idGaraje = 1;
			String direccion = "Av. Victoria 123";
			Integer espaciosDisponibles = 10;
			Garaje garaje = new Garaje(idGaraje, direccion, espaciosDisponibles);
			
			String sa = "sa";
			Integer cuit = 392829101;
			Agencia agencia = new Agencia(sa, cuit);
			agencia.registrarUnGaraje(garaje);
			garaje.registrarAuto(auto);
			boolean cambiado =agencia.cambiarDeGaraje(auto);
			assertTrue(cambiado);
		}
//		queSePuedaEliminarUnaReservaPorqueElClienteLoCancelo()
		@Test
		public void queSePuedaEliminarUnaReservaPorqueElClienteLoCancelo() {
			String patente = "AD 115 PX";
			String marca = "Volkswagen";
			String modelo = "Suran 2016";
			Double precioPorDia = 4500.0;
			Auto auto = new Auto(patente, marca, modelo, precioPorDia);
			
			Integer codigo = 9999;
			Cliente juan = new Cliente(111111, "Juan Perez", "Calle falsa 123", 1122334455);
			Integer dias = 15;
			
			String sa = "sa";
			Integer cuit = 392829101;
			Agencia agencia = new Agencia(sa, cuit);
			
			Reserva reserva = new Reserva(codigo, juan, auto, dias);
			
			assertNotNull(agencia.alquilarAuto(codigo, juan, auto, dias));
			
			assertNull(agencia.cancelarAuto());
		}

	}