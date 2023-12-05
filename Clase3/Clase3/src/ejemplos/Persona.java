package ejemplos;
import intefaces.*;
public class Persona implements Ejemplo {
	
	public String nombre;
	public int edad;
	
	public Persona() {
		nombre = "Jorge";
		edad = 40;
	}

	public Persona(String nombre, int edad) {
		
		this.nombre = nombre;
		this.edad = edad;
	
	}
	
	public void caminar() {
		
		System.out.println("Estoy Caminado");
	}
	public void escuchar() {
		System.out.println("Estoy Escuchando");
	}
	public void ver() {
		System.out.println("Estoy Mirando");
	}
	
	
}
