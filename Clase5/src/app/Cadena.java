package app;
import java.util.Stack;
public class Cadena {

	
	public static boolean revisarCadena(String cadena) {
		
		Stack<Character> balanceCadena = new Stack<>();
		
		for(char caracter : cadena.toCharArray() ) {
			
			if(caracter == '(' && caracter == '[' && caracter == '{') {
				
				balanceCadena.push(caracter);
				
			}else if ( caracter == ')' && caracter == ']' && caracter == '}'){
				
				if(balanceCadena.isEmpty()) {
					
					return false;
				}
				
				char elementoSuperior = balanceCadena.pop();
				
				if(caracter==')' && elementoSuperior != '(' || caracter == ']' && elementoSuperior != '[' ||  caracter == '}' && elementoSuperior != '{') {
					
					
	                return false;    	
	                    	
	            }
				
				
				
			
		
			
		}
		
		
		return balanceCadena.isEmpty();
	}
	
	
	public static void main(String[] args) {
	
		
		String cadena = "{([[()]])}";
		
		boolean balanceado = revisarCadena(cadena);
		
		if(balanceado) {
			System.out.println("Esta Balanceado");
		}else {
			System.out.println("No Esta Balanceado");
		}

	}

}
