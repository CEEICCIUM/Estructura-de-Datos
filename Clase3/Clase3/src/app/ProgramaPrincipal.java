package app;
import ejemplos.*;

public class ProgramaPrincipal {
	
	//propiedad o atributo
	int num; 
	
	public void imprimirNombre(String nombre) {
		
		System.out.print(nombre);
	}
	
	//metodos
	public static void main(String [] args) {
		
	/*	ProgramaPrincipal programa = new ProgramaPrincipal();
		programa.imprimirNombre("Jorge");
		
		ProgramaPrincipal programa1 = new ProgramaPrincipal();
		programa1.imprimirNombre("Maria");
		
	*/
	/*
		Animal animal;
		Leon leon = new Leon();
		
		animal = leon; //Coersion.
		
		animal.hacerSonido();
	*/
	
	
		/* Animal animal = new Leon();
		
		if(animal instanceof Leon) {
			
			Leon leon = (Leon) animal;  //Casting
			leon.rugir();
			
		}
	
		if(animal instanceof Leon) {
			
			((Leon) animal).rugir(); //Casting
		}
		*/
		// Encapsulamiento
		
		/*
		Circulo circulo = new Circulo(10);

		
		System.out.print("Area del circulo es: "+ circulo.calcularArea());
	
	*/
		Persona persona = new Persona("Juan", 25);
		
		System.out.println("El nombres es " + persona.nombre);
		System.out.println("La edad es " + persona.edad);
		
		persona.ver();
		persona.escuchar();
		persona.caminar();
		
		
	}
	
	
	
}
