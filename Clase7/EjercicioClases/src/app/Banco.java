package app;
import java.util.LinkedList; 
import java.util.Queue; 


public class Banco {

   
    public static void mostrarClientesAtendidos(Queue<Cliente> cola) {
    	
    	 while (!cola.isEmpty()) { 
    		 
             Cliente cliente = cola.poll(); 
             System.out.println("Atendiendo a " + cliente.getNombre() + " - Tipo de transacción: " + cliente.getTipoTransaccion()); 
         } 
    	
    }
    
    
	public static void main(String[] args) {

		
        Queue<Cliente> colaClientes = new LinkedList<>(); 
        colaClientes.offer(new Cliente("Cliente 2", "Retiro")); 
        colaClientes.offer(new Cliente("Cliente 1", "Depósito")); 
        colaClientes.offer(new Cliente("Cliente 3", "Consulta")); 
		
        System.out.println("Clientes en espera:"); 
        
        for (Cliente cliente : colaClientes) { 
            System.out.println(cliente); 
        } 

        System.out.println("\nAtendiendo a los clientes:"); 

        mostrarClientesAtendidos(colaClientes);
	}
}