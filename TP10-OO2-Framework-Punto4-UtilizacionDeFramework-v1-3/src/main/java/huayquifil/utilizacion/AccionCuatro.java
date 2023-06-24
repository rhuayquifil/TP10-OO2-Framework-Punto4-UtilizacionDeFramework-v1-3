package huayquifil.utilizacion;

import huayquifil.framework.Accion;

public class AccionCuatro implements Accion {
	@Override
	public void ejecutar() {
		System.out.println("Ejecutando AccionCuatro...");
	}

	@Override
	public String nombreItemMenu() {
		return "Accion 4";
	}

	@Override
	public String descripcionItemMenu() {
		return "Esto trae las primeras diez personas de la BD...";
	}
}
