package Punto9;

public class Moto extends Vehiculo {
    @Override
    public void alquilar() {
        System.out.println("Alquilando una Moto.");
    }
    
    public void conducir() {
        System.out.println("Conduciendo la moto...");
    }
}