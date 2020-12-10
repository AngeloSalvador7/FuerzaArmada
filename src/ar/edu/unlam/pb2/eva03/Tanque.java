package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {
	
	Double velocidad = 0.0;
	
	public Tanque (Integer codigo, String descripcion) {
		super (codigo, descripcion);
	}
	
	@Override
	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad= velocidad;
	}
}
