package ejercicio1;
import java.util.Scanner;


public class TiendaEnLinea {

	
	
	public static double calcularDescuento(double subtotal) {
		
		if(subtotal >= 100) {
			
			return subtotal * 0.1;
		}else {
			
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		
		/*
		 * Escribe una función llamada calcularDescuento que tome un valor de subtotal como entrada y devuelva el valor del descuento aplicado. Si el subtotal es igual o superior a $100, se aplica un descuento del 10%; de lo contrario, no se aplica descuento.
		 * En el método main, da la bienvenida a los usuarios a la tienda en línea y pide la cantidad de productos en su carrito. Asegúrate de que la cantidad ingresada sea un número positivo.
		 * Utiliza un bucle for para solicitar al usuario que ingrese el precio de cada producto en el carrito. Calcula el subtotal acumulando los precios de los productos
		 * Llama a la función calcularDescuento para obtener el descuento basado en el subtotal.​
		 * Calcula el total a pagar restando el descuento del subtotal.​
		 * Muestra un resumen de la compra, incluyendo el subtotal, el descuento y el total a pagar.​
		 * Pregunta al usuario si desea realizar otra compra. Si elige "S" o "s", reinicia el programa; de lo contrario, muestra un mensaje de despedida.
		 * */
		
		System.out.println("Bievenido a la tienda en linea");
		Scanner scanner = new Scanner(System.in);
		
		int cantidadProductos;
		
		do {
			
			System.out.println("Ingrese la cantidad de productos en su carrito");
			cantidadProductos = scanner.nextInt();
			
		}while(cantidadProductos <= 0);
		
		double subtotal = 0;
		for(int i=1;i<=cantidadProductos;i++) {
			
			System.out.print("Ingrese el precio del producto #" + i + ": " );
			double precio = scanner.nextDouble();
			//subtotal = subtotal + precio;
			subtotal += precio;
		}
		
		
		double descuento = calcularDescuento(subtotal);
		double total = subtotal - descuento; 
		
		System.out.println("\nResumen de la Compra");
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Descuento: $" + descuento);
		System.out.println("Total a pagar: $" + total);
		
		
		System.out.println("¿Desea realizar otra compra? (S/N)");
		char respuesta = scanner.next().charAt(0);
		
		if(respuesta == 'S' || respuesta == 's') {
			
			main(args);
		}else {
			
			System.out.println("Gracias por comprar en nuestra tienda");
		}
		
		
		scanner.close();

	}

}
