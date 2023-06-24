package huayquifil.main;

import huayquifil.framework.AlzarAccionesDeArchivo;
import huayquifil.framework.Framework;

public class Main {

	public static void main(String[] args) {

//		Framework framework = new Framework(new AlzarAccionesDeArchivo("/acciones.properties"));

		Framework framework = new Framework(new AlzarAccionesDeArchivo(
				"C:\\Users\\ezehu\\Documents\\Programas\\Orientacion a Objetos 2 - 2023\\TP10-OO2-Framework-Punto4-UtilizacionDeFramework-v1-3\\src\\main\\resources\\acciones.json"));
		framework.init();
	}

}
