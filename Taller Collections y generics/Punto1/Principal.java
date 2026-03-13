package Punto1;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        ListaDeTareas<String> misTareas = new ListaDeTareas<>();

        Calendar cal = Calendar.getInstance();

        cal.add(Calendar.DAY_OF_YEAR, 5);
        misTareas.agregarTarea(new Tarea<>("Tarea 1", 1, cal.getTime()));

        misTareas.agregarTarea(new Tarea<>("Tarea 2", 1, new Date()));

        cal.add(Calendar.DAY_OF_YEAR, 5);
        misTareas.agregarTarea(new Tarea<>("Tarea 3", 3, cal.getTime()));

        System.out.println("TODAS LAS TAREAS ORDENADAS POR FECHA: ");
        misTareas.mostrarTareasOrdenadas();

        System.out.println("\n FILTRADO: TAREAS DE PRIORIDAD 1 ");
        List<Tarea<String>> prioridad1 = misTareas.obtenerTareasPorPrioridad(1);
        for (Tarea<String> t : prioridad1) {
            System.out.println(t);
        }
    }
}