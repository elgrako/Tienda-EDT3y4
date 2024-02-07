package menu;

import app.Aplicacion;
import leer.Leer;

/**
 * @author Lucas
 *
 */
public class Menu {
	// Metodo principal para iniciar el programa
	public static void main(String[] args) {
		Aplicacion.Mensaje_Inicial();

		boolean continuar = true;
		Aplicacion.Opciones_Menu();
		do {
			switch (Leer.datoInt()) { // Importamos desde la clase Leer
			case 1:
				Aplicacion.MostrarProductos();// Importamos desde la clase Aplicacion
				break;
			case 2:
				Aplicacion.ComprarProductos();
				break;
			case 3:
				Aplicacion.MostrarCaja();
				break;
			default:
				continuar = false;
			}

		} while (continuar);

		Aplicacion.Mensaje_Fin();
	}
}
