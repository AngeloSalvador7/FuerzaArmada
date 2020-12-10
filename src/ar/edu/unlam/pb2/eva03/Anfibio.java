package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Acuatico, Terrestre{
	
	Double velocidad = 0.0;
	Double profundidad = 0.0;
	
	public Anfibio(Integer codigo, String descripcion) {
		super(codigo, descripcion);
	}

	@Override
	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad= velocidad;
	}
	
	@Override
	public Double getProfundidad() {
		return profundidad;
	}
	
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}
}
