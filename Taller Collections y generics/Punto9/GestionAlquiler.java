package Punto9;
import java.util.List;

public class GestionAlquiler {

    public static void alquilarVehiculos(List<? extends Vehiculo> listaVehiculos) {
        for (Vehiculo v : listaVehiculos) {
            v.alquilar();
        }
    }
}
