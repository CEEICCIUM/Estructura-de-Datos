package app;
import java.util.Queue;
import java.util.LinkedList;

public class Colas {

	public static void main(String[] args) {
		
		Queue<String> cola = new LinkedList<>();
		
		
		cola.offer("Elemento 1");
		cola.offer("Elemento 2");
		cola.offer("Elemento 3");
		
		cola.add("Elemento 4");
		cola.add("Elemento 5");
		cola.add("Elemento 6");

		System.out.println("Contenido de la cola: " + cola);
		
		cola.clear();
		String primerElemento = cola.remove();
		

		System.out.println("Primer elemento: " + primerElemento);

		System.out.println("Contenido de la cola: " + cola);
		
		String segundoElemento = cola.peek();
		
		System.out.println("Segundo elemento: " + segundoElemento);

		System.out.println("Contenido de la cola: " + cola);
		
	}

}
