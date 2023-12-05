package app;
import java.util.Stack;
public class Historial {

	public static void main(String[] args) {
		
		
		Stack<String> historial = new Stack<>();
		
		historial.push("https://www.mayor.cl");
		historial.push("https://www.mayor.cl/intranet");
		historial.push("https://www.mayor.cl/notas");		
		
		
		for(String url : historial) {
			
			System.out.println(url);
		}
		
		//Obtener la pagina actual
		String paginaActual = historial.peek();
		System.out.println("Esta es la pagina actual de navegacion " + paginaActual);
		
		for(String url : historial) {
			
			System.out.println(url);
		}
		
		//Obtener la pagina anterior
		historial.peek();
		historial.peek();
		historial.peek();
		if(!historial.isEmpty()) {
			String paginaAnterior = historial.peek();
			System.out.println("Esta es la pagina anterior de navegacion " + paginaAnterior);

		}else {
			
			System.out.println("LA PILA ESTA VACIA");
		}
		
		

	}

}
