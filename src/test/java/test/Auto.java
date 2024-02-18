package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		int cantidad = 0;
		for (Asiento asiento : asientos) {
			if (asiento instanceof Asiento) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	public String verificarIntegridad() {
		boolean integridad = true;
		if (registro != motor.registro) {
			integridad = false;
		}
		
		for (Asiento asiento : asientos) {
			if (asiento != null) {
				if (registro != asiento.registro) {
					integridad = false;
					break;
				}
			}
			
		}
		
		if (integridad == true) {
			return "Auto original";
		} else {
			return "Las piezas no son originales";
		}
	}
}