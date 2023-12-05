package app;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Map<String, Estudiante> registroEstudiantes = new HashMap<>();
		
		
		
		
		for(int i=1; i<=2; i++) {
		
			System.out.println("Ingrese información para el estudiante: " + i +" :");
			System.out.print("Nombre: ");
			String nombre = scanner.nextLine();
			System.out.print("Edad: ");
			//if(scanner.hasNextFloat())
			int edad = scanner.nextInt();
			System.out.print("Calificacion: ");
			double calificacion = scanner.nextDouble();
			scanner.nextLine();
			
			try {
				
				
				
				Estudiante estudiante = new Estudiante(nombre,edad,calificacion);
				registroEstudiantes.put(nombre, estudiante);
					
					
			
			}catch(NumberFormatException e) {
				
				int numeroEntero = edad;
						
				System.out.println(e);
			}
		
			
			
		}

		
		System.out.println("\nInformacion Estudiantes");
		for(Map.Entry<String, Estudiante> entry: registroEstudiantes.entrySet())
		{
			
		
			
			
			Estudiante estudiante = entry.getValue();
			
			System.out.println("Nombre " + estudiante.getNombre());
			System.out.println("Edad " + estudiante.getEdad());
			System.out.println("Calificacion " + estudiante.getCalificacion());
		} 
		
		
		if(registroEstudiantes.containsKey("Andres")) 
		{
			registroEstudiantes.remove("Andres");
			
		}else {
			System.out.println("No existe la llave proporcionada");
		}
		
		
		System.out.print(registroEstudiantes);
		
	}

}
