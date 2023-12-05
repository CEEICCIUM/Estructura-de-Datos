package ejemplos;
import java.util.Scanner;

public class Recursiva {
	
	public static int calcularFactorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}else {
			return n * calcularFactorial(n-1);
		}
	}

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrse un numero para calcular su factorial");
		int numero = scanner.nextInt();
		
		if(numero < 0) {
			System.out.println("El factorial no esta definido para numeros negativos");
		}else {
			
			int factorial = calcularFactorial(numero);
			System.out.println("El factorial de " + numero + " es: " + factorial);
		}
		
		scanner.close();
	}
	
}
