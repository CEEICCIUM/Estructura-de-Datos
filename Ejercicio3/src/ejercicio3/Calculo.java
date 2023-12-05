package ejercicio3;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3, nota4;
		double promedio, suma;

		try {
			System.out.println("Ingrese Nota 1:");
			nota1 = sc.nextDouble();
			
			System.out.println("Ingrese Nota 2");
			nota2 = sc.nextDouble();
			
			System.out.println("Ingrese Nota 3");
			nota3 = sc.nextDouble();
			
			System.out.println("Ingrese Nota 4");
			nota4 = sc.nextDouble();
			
			suma = nota1 + nota2 + nota3 + nota4;
			promedio = suma / 4;
			
			System.out.println();
			System.out.println("Promedio Final");
			System.out.println(promedio);
			
			sc.close();
		}
		catch(Exception ex) {
			System.out.println("Formato Incorrecto");
		}
		
	}
}
