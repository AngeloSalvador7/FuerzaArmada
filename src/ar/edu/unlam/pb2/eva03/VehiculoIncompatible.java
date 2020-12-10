package ar.edu.unlam.pb2.eva03;

public class VehiculoIncompatible extends Exception {

	private static final long serialVersionUID = 1L;

	public VehiculoIncompatible () {
		super("El vehiculo no es compatible con la batalla.");
	}
}
