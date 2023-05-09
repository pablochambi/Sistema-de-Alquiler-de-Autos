package ar.edu.unlam.pb2.sistemaAlquilerAutos;

public class Auto {
	
	private String patente;
	private String marca;
	private String modelo;
	private Double precioPorDia;
	private Garaje garaje;
	private Boolean estaDisponible;
	
	public Auto(String patente, String marca, String modelo, Double precioPorDia) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.precioPorDia = precioPorDia;
		this.estaDisponible = true;
	}

	public Auto(String patente, String marca, String modelo, Double precioPorDia, Garaje garaje) {
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.precioPorDia = precioPorDia;
		this.garaje = garaje;
	}
	
	
	public void reservar() {
        estaDisponible = false;
    }

    public void devolver() {
        estaDisponible = true;
    }

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPrecioPorDia() {
		return precioPorDia;
	}

	public void setPrecioPorDia(Double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	public Garaje getGaraje() {
		return garaje;
	}

	public void setGaraje(Garaje garaje) {
		this.garaje = garaje;
	}

	
	public Boolean getEstaDisponoble() {
		return estaDisponible;
	}

	public void setEstaDisponoble(Boolean estaDisponoble) {
		this.estaDisponible = estaDisponoble;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}
	
	
	
	
	
}