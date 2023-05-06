package ar.edu.unlam.pb2.sistemaAlquilerAutos;

import java.util.ArrayList;

public class Garaje {
	
	private Integer idGaraje;
	private String direccion;
	private Integer espaciosDisponibles;
	private ArrayList<Auto> autosEnElGaraje;
	
	

	public Garaje(Integer idGaraje,  String direccion, Integer espaciosDisponibles) {
		this.idGaraje= idGaraje;
		this.direccion = direccion;
		this.espaciosDisponibles = espaciosDisponibles;
		autosEnElGaraje = new ArrayList<>();
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	public Integer getIdGaraje() {
		return idGaraje;
	}

	public void setIdGaraje(Integer idGaraje) {
		this.idGaraje = idGaraje;
	}

	
	public boolean agregarAuto(Auto auto) {
        if (espaciosDisponibles > 0) {
            this.autosEnElGaraje.add(auto);
            espaciosDisponibles--;
            return true;			//Si se agrego
        } else {
            return false;		//no se agrego
        }
    }

	
	
	

}
