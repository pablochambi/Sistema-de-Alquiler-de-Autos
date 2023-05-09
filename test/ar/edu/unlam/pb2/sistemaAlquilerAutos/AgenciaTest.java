package ar.edu.unlam.pb2.sistemaAlquilerAutos;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgenciaTest {

	@Test
	public void queSePuedaRegistrarUnGarajeAUnaAgencia() {
		// Preparacion de datos
		String razonSocial = "Rodriguez y cia S.R.L";
		Integer cuit = 250686778;
		Agencia ag = new Agencia(razonSocial, cuit);

		Integer idGaraje = 1;
		String direccion = "Av. Victoria 123";
		Integer espaciosDisponibles = 4;
		Garaje garaje1 = new Garaje(idGaraje, direccion, espaciosDisponibles);

		// Ejecuciones
		Boolean exitoso = ag.registrarUnGaraje(garaje1);
		// validaciones
		assertTrue(exitoso);
		assertEquals((Integer) 1, ag.cantDeGarajesDisponibles());
	}

	@Test
	public void queSePuedaRegistrarUnAutoEnUnaAgencia() {
		// Preparacion de datos
		String razonSocial = "Rodriguez y cia S.R.L";
		Integer cuit = 250686778;
		Agencia ag = new Agencia(razonSocial, cuit);

		Integer idGaraje = 1;
		String direccion = "Av. Victoria 123";
		Integer espaciosDisponibles = 10;
		Garaje garaje1 = new Garaje(idGaraje, direccion, espaciosDisponibles);

		String patente = "USD 660";
		String marca = "Renauld kwid";
		String modelo = "Climber";
		Double precioPorDia = 8000.0;
		Auto auto1 = new Auto(patente, marca, modelo, precioPorDia);
		Auto auto2 = new Auto("USD 660", "Chevrolet","Camaro", 8000.0);
		
		// Ejecuciones
		ag.registrarUnGaraje(garaje1);
		ag.registrarUnAuto(auto1, garaje1);
		ag.registrarUnAuto(auto2, garaje1);
		// Validaciones
		//assertTrue(exitoso);
		assertEquals((Integer) 2, ag.cantidaDeAutosDisponibles());
		assertTrue(ag.getAutos().contains(auto1));

	}
	
	@Test
	public void queNoSePuedaRegistrarDosAutosConLaMismaPatente() {
		
		// Preparacion de datos
		String razonSocial = "Rodriguez y cia S.R.L";
		Integer cuit = 250686778;
		Agencia ag = new Agencia(razonSocial, cuit);

		Integer idGaraje = 1;
		String direccion = "Av. Victoria 123";
		Integer espaciosDisponibles = 10;
		Garaje garaje1 = new Garaje(idGaraje, direccion, espaciosDisponibles);

		String patente = "USD 660";
		String marca = "Renauld kwid";
		String modelo = "Climber";
		Double precioPorDia = 8000.0;
		Auto auto1 = new Auto(patente, marca, modelo, precioPorDia);
		Auto auto2 = new Auto("USD 660", "Chevrolet","Camaro", 8000.0);
		Auto auto3 = new Auto("USS 770", "Chevrolet", "Equinox", 10000.0);
		
		// Ejecuciones
		ag.registrarUnGaraje(garaje1);
		ag.registrarUnAuto(auto1, garaje1);//auto con   Patente USD 660
		ag.registrarUnAuto(auto2, garaje1);//otro auto con Patente USD 660
		// Validaciones
	
		assertEquals((Integer) 1, ag.cantidaDeAutosDisponibles());
		assertTrue(ag.getAutos().contains(auto1));
	}
	
	@Test
	public void queCuandoSeRegistrenAutosEnUnGarajeEsteDismunuyaSuEspacioDisponible() {

		// Preparacion de datos
		String razonSocial = "Rodriguez y cia S.R.L";
		Integer cuit = 250686778;
		Agencia ag = new Agencia(razonSocial, cuit);

		Integer idGaraje = 1;
		String direccion = "Av. Victoria 123";
		Integer espaciosDisponibles = 10;
		Garaje garaje1 = new Garaje(idGaraje, direccion, espaciosDisponibles);

		String patente = "USD 660";
		String marca = "Renauld kwid";
		String modelo = "Climber";
		Double precioPorDia = 5000.0;
		Auto auto1 = new Auto(patente, marca, modelo, precioPorDia);
		Auto auto2 = new Auto("USY 550", "Chevrolet","Camaro", 8000.0);
		Auto auto3 = new Auto("USS 770", "Chevrolet", "Equinox", 10000.0);
		
		final Integer ESPACIO_DISPONIBLE_ESPERADO = espaciosDisponibles - 3;
		
		// Acciones
		ag.registrarUnGaraje(garaje1);
		ag.registrarUnAuto(auto1, garaje1);
		ag.registrarUnAuto(auto2, garaje1);
		ag.registrarUnAuto(auto3, garaje1);
		final Integer AUTOS_DISPONIBLES = ag.cantidaDeAutosDisponibles();
		
		
		// Validaciones
		assertEquals(ESPACIO_DISPONIBLE_ESPERADO, garaje1.getEspaciosDisponibles());
		assertEquals((Integer)3,AUTOS_DISPONIBLES);
		
	}
	
	@Test
	public void queCuandoSeAlquilenDosAutosSeDismunuyaLosAutosDisponibles() {
		// Preparacion de datos
		String razonSocial = "Rodriguez y cia S.R.L";
		Integer cuit = 250686778;
		Agencia ag = new Agencia(razonSocial, cuit);

		Integer idGaraje = 1;
		String direccion = "Av. Victoria 123";
		Integer espaciosDisponibles = 10;
		Garaje garaje1 = new Garaje(idGaraje, direccion, espaciosDisponibles);

		String patente = "USD 660";
		String marca = "Renauld kwid";
		String modelo = "Climber";
		Double precioPorDia = 5000.0;
		Auto auto1 = new Auto(patente, marca, modelo, precioPorDia);
		Auto auto2 = new Auto("USY 550", "Chevrolet","Camaro", 8000.0);
		Auto auto3 = new Auto("USS 770", "Chevrolet", "Equinox", 10000.0);
		Auto auto4 = new Auto("BUS 850", "Chevrolet","Camaro", 8000.0);
		Auto auto5 = new Auto("CAR 970", "Chevrolet", "Equinox", 10000.0);
		
		Integer dni = 34535345; 
		String apellidoNombre = "Elon Musk";
		String direccionC = "Av Libertadores 1234";
		Integer telefono = 462415441;
		Cliente cliente1 = new Cliente(dni, apellidoNombre, direccionC, telefono);
		
		// Acciones
		ag.registrarUnGaraje(garaje1);
		
		ag.registrarUnAuto(auto1, garaje1);
		ag.registrarUnAuto(auto2, garaje1);
		ag.registrarUnAuto(auto3, garaje1);
		ag.registrarUnAuto(auto4, garaje1);
		ag.registrarUnAuto(auto5, garaje1);
	
		final Integer AUTOS_DISPONIBLES_INICIAL = ag.cantidaDeAutosDisponibles();
		
		
		Integer codReserva = 1;
		Integer diasAlquiler = 5;
		Reserva reserva1 = ag.alquilarAuto(codReserva, cliente1, auto5, diasAlquiler);
		
		final Integer AUTOS_DISPONIBLES_DESPUES_DE_LA_RESERVA = ag.cantidaDeAutosDisponibles();
		
		// Validaciones
		assertEquals((Integer)5, AUTOS_DISPONIBLES_INICIAL);
		assertEquals((Integer)4,AUTOS_DISPONIBLES_DESPUES_DE_LA_RESERVA);
	}
	

	@Test
	public void queSeSepaElValorFinalDeUnAutoDe10MilPorDiaReservadoPor5Dias() {

		// Preparacion de datos
		String razonSocial = "Rodriguez y cia S.R.L";
		Integer cuit = 250686778;
		Agencia ag = new Agencia(razonSocial, cuit);

		Integer idGaraje = 1;
		String direccion = "Av. Victoria 123";
		Integer espaciosDisponibles = 10;
		Garaje garaje1 = new Garaje(idGaraje, direccion, espaciosDisponibles);

		String patente = "USD 660";
		String marca = "Renauld kwid";
		String modelo = "Climber";
		Double precioPorDia = 5000.0;
		Auto auto1 = new Auto(patente, marca, modelo, precioPorDia);
		Auto auto2 = new Auto("USY 550", "Chevrolet","Camaro", 8000.0);
		Auto auto3 = new Auto("USS 770", "Chevrolet", "Equinox", 10000.0);
		Auto auto4 = new Auto("BUS 850", "Chevrolet","Camaro", 8000.0);
		Auto auto5 = new Auto("CAR 970", "Chevrolet", "Equinox", 10000.0);
		
		Integer dni = 34535345; 
		String apellidoNombre = "Elon Musk";
		String direccionC = "Av Libertadores 1234";
		Integer telefono = 462415441;
		Cliente cliente1 = new Cliente(dni, apellidoNombre, direccionC, telefono);
		
		// Acciones
		ag.registrarUnGaraje(garaje1);
		
		ag.registrarUnAuto(auto1, garaje1);
		ag.registrarUnAuto(auto2, garaje1);
		ag.registrarUnAuto(auto3, garaje1);
		ag.registrarUnAuto(auto4, garaje1);
		ag.registrarUnAuto(auto5, garaje1);
		
		
		Integer codReserva = 1;
		Integer diasAlquiler = 5;
		Reserva reserva1 = ag.alquilarAuto(codReserva, cliente1, auto5, diasAlquiler);
		
		final Double PRECIO_TOTAL_RESERVA_ESPERADO = 10000.0*5;
		final Double PRECIO_TOTAL_RESERVA = reserva1.getPrecioTotal();
		
		
		// Validaciones

		assertEquals(PRECIO_TOTAL_RESERVA_ESPERADO, PRECIO_TOTAL_RESERVA);
	}
	
	

	
	
	
	
	

///queSePuedaRegistrarUnGarajeAUnaAgencia()	Listo
//	queSePuedaRegistrarUnAutoEnUnaAgencia()	Listo
	
//	queSePuedaRegistrarUnClienteEnUnaAgencia()
//	queSePuedaRegistrarUnaReservaEnUnaAgencia()

//	queSePuedaEliminarUnAutoDeUnaAgencia()
//	queSePuedaCambiarElPrecioXDiaDeUnAuto()
	
//	queSePuedaCambiarDeGarajeUnAuto()
//	queSePuedaEliminarUnaReservaPorqueElClienteLoCancelo()

}
