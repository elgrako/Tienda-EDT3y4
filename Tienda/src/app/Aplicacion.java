package app;

import leer.Leer;

/**
 * @author Lucas
 *
 */
public class Aplicacion {
	private static String[] productos = { "Agua", "Chuches", "Refresco" };
	private static int[] precios = { 1, 2, 3 };
	private static float totalCompras = 0.0f;
	
	// Muestra los productos disponibles
	public static void MostrarProductos() {
		System.out.println("Productos disponibles:");
		for (int i = 0; i < productos.length; i++) {
			System.out.println((i + 1) + ". " + productos[i] + " - Precio: $" + precios[i]);
		}
	}
	//Para comprar los productos seleccionados
	public static void ComprarProductos() {
		MostrarProductos();
		System.out.println("Ingrese el numero del producto que desea comprar: ");
		int opcion = Leer.datoInt();//recogemos un int y calculamos en base a la cantidad de productos
		if (opcion < 1 || opcion > productos.length) {
			System.out.println("Opcion invalida");
			return;
		}

		int indiceProducto = opcion - 1;
		System.out.println("¿Que cantidad desea comprar?: ");
		int cantidad = Leer.datoInt();
		float total = precios[indiceProducto] * cantidad;
		totalCompras += total;
		System.out.println("El total de su compra es: $" + total);
	}
		//Muestra el importe total
	public static void MostrarCaja() {
		System.out.println("El importe total es: " + totalCompras);

	}
	// Muestra el mensaje inicial del programa
	public static void Mensaje_Inicial() {

		System.out.println(
				"Bienvenido a la tienda virtual\n\n" + "El programa simula una tienda que vende juegos, música y cine\n"
						+ "Solamente se pueden vender productos si aparecen disponibles en la tienda\n");
	}
	//Muestra las opciones del menu
	public static void Opciones_Menu() {

		System.out.println("\nSeleccione que desea realizar:\n\n" + "\t1. Mostrar productos. (Listar productos)\n"
				+ "\t2. Comprar productos\n" + "\t3. Mostrar caja. (Importe total de la compra actual)\n"
				+ "\tSALIR --> Pulse cualquier otro número\n");
	}
	// Muestra el mensaje final del programa
	public static void Mensaje_Fin() {

		System.out.println("---- Gracias por usar este software. ----");
	}
}
