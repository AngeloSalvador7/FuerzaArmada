package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {

	Double altura = 0.0;
	
	public Avion (Integer codigo, String descripcion) {
		super(codigo, descripcion);
	}

	@Override
	public Double getAltura() {
		return altura;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
}
