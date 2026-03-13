package Punto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaDeTareas<T> implements Iterable<Tarea<T>> {
    private List<Tarea<T>> tareas;

    public ListaDeTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea<T> tarea) {
        this.tareas.add(tarea);
    }

    public List<Tarea<T>> obtenerTareasPorPrioridad(int prioridadBuscada) {
        List<Tarea<T>> filtradas = new ArrayList<>();
        for (Tarea<T> t : tareas) {
            if (t.getPrioridad() == prioridadBuscada) {
                filtradas.add(t);
            }
        }
        return filtradas;
    }

    public void mostrarTareasOrdenadas() {
        List<Tarea<T>> copiaOrdenada = new ArrayList<>(tareas);
        Collections.sort(copiaOrdenada); 
        for (Tarea<T> t : copiaOrdenada) {
            System.out.println(t);
        }
    }

    @Override
    public Iterator<Tarea<T>> iterator() {
        return tareas.iterator();
    }
}