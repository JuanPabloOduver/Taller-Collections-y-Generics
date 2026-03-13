package Punto9;

public class Camion extends Vehiculo {
    @Override
    public void alquilar() {
        System.out.println("Alquilando un Camión.");
    }
    
    public void cargar() {
        System.out.println("Cargando el camión...");
    }
}
