package app;

public class Cliente {
	
    private String nombre; 
    private String tipoTransaccion; 

    public Cliente(String nombre, String tipoTransaccion) { 

        this.nombre = nombre; 
        this.tipoTransaccion = tipoTransaccion; 
    } 

    public String getNombre() { 
        return nombre; 
    } 

    public String getTipoTransaccion() { 
        return tipoTransaccion; 
    } 
    
    @Override
    public String toString() { 

        return "Cliente{" + 

                "nombre='" + nombre + '\'' + 

                ", tipoTransaccion='" + tipoTransaccion + '\'' + 

                '}'; 

    }

}
