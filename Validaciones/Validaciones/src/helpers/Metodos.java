package helpers;
import java.util.Scanner;

public class Metodos {

	public static float pedirNumeroFlotante() {
		
		Scanner scanner = new Scanner(System.in);
		float numero;
		
		while(true) {
			System.out.print("Ingrese Numero: ");
			if(scanner.hasNextFloat()) 
			{
				numero = scanner.nextFloat();
				break;
			}else {
				System.out.println("El Numero no es valido");
				scanner.next();
			}
		}
			scanner.close();
			return numero;
	}
	
	public static boolean validarRut(String rut) {

		boolean validacion = false;
		try {
			rut =  rut.toUpperCase();
			rut = rut.replace(".", "");
			rut = rut.replace("-", "");
			int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

			char dv = rut.charAt(rut.length() - 1);
	
			int m = 0, s = 1;
			for (; rutAux != 0; rutAux /= 10) {
			s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
			}
			if (dv == (char) (s != 0 ? s + 47 : 75)) {
			validacion = true;
			}

			} catch (java.lang.NumberFormatException e) {
		} catch (Exception e) {}
		
		
		return validacion;
	}
} 
