package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Acuatico, Volador{
	

	Double altura = 0.0;
	Double profundidad = 0.0;
	
	public HidroAvion(Integer codigo, String descripcion) {
		super(codigo, descripcion);
	}

	@Override
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura (Double altura) {
		this.altura = altura;
	}

	@Override
	public Double getProfundidad() {
		return profundidad;
	}
	
	public void setProfundidad(Double profundidad){
		this.profundidad = profundidad;
	}
}
