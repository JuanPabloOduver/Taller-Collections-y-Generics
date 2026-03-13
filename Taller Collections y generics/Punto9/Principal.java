package Punto9;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Moto> listaDeMotos = new ArrayList<>();
        listaDeMotos.add(new Moto());
        
        List<Camion> listaDeCamiones = new ArrayList<>();
        listaDeCamiones.add(new Camion());

        System.out.println("Procesando Motos");
        GestionAlquiler.alquilarVehiculos(listaDeMotos);

        System.out.println("\n Procesando Camiones");
        GestionAlquiler.alquilarVehiculos(listaDeCamiones);
    }
}
