package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
	}

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.batallas.put(nombre, new Batalla(latitud, longitud, tipo));
	}

	public Batalla getBatalla(String nombre) {
		return this.batallas.get(nombre);
	}

	private Vehiculo buscarVehiculo(Integer codigoAbuscar) {

		for (Vehiculo vehiculoExistente : this.convoy) {
			if (vehiculoExistente.getCodigo().equals(codigoAbuscar)) {
				return vehiculoExistente;
			}
		}
		return null;
	}

	public Boolean enviarALaBatalla(String nombreDeLaBatalla, Integer codigo)
			throws VehiculoInexistente, VehiculoIncompatible {

		Boolean enviarABatalla = false;
		Batalla batalla = batallas.get(nombreDeLaBatalla);
		Vehiculo vehiculo = this.buscarVehiculo(codigo);

		if (this.convoy.contains(vehiculo)) {

			switch (batalla.getTipo()) {
			case TERRESTRE:
				if (!(vehiculo instanceof Terrestre))
					throw new VehiculoIncompatible();
				else {
					batalla.añadirVehiculosEnLaBatalla(vehiculo);
					enviarABatalla = true;
				}
				break;

			case NAVAL:
				if (!(vehiculo instanceof Acuatico))
					throw new VehiculoIncompatible();
				else {
					batalla.añadirVehiculosEnLaBatalla(vehiculo);
					enviarABatalla = true;
				}
				break;

			case AEREA:
				if (!(vehiculo instanceof Volador))
					throw new VehiculoIncompatible();
				else {
					batalla.añadirVehiculosEnLaBatalla(vehiculo);
					enviarABatalla = true;
				}
				break;
			}

		} else {
			throw new VehiculoInexistente();
		}

		return enviarABatalla;
	}

}
