package ar.edu.unlam.pb2.eva03;

public class VehiculoInexistente extends Exception {

	private static final long serialVersionUID = 1L;

	public VehiculoInexistente() {	
		super("El vehiculo no existe en el Convoy.");
	}
	
}
