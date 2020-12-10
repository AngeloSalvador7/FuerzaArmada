package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico {

	Double profundidad = 0.0;
	
	public Submarino (Integer codigo, String descripcion) {
		super(codigo, descripcion);
	}
	
	@Override
	public Double getProfundidad() {
		return profundidad;
	}

}
