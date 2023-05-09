package ar.edu.unlam.pb2.sistemaAlquilerAutos;

import static org.junit.Assert.*;

import org.junit.Test;

public class CambiarPrecioXDia {

	@Test
	public void queSePuedaCambiarElPrecioXDiaDeUnAuto() {
	    // Crear garaje y agregar un auto con precio por día X
	    Garaje garaje = new Garaje(1, "Av. Victoria 123", 10);
	    Auto auto = new Auto("AD 115 PX", "Volkswagen", "Suran 2016", 4500.0);
	    auto.setPrecioPorDia(4500.0);
	    garaje.agregarAuto(auto);

	    // Cambiar el precio x dia
	    auto.setPrecioPorDia(1500.0);

	    // Verificar
	    assertEquals(1500.0, auto.getPrecioPorDia(), 0.001);
	}
}