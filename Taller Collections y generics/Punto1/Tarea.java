package Punto1;

import java.util.Date;

public class Tarea<T> implements Comparable<Tarea<T>> {
    private T descripcion;
    private int prioridad;
    private Date fechaVencimiento;

    public Tarea(T descripcion, int prioridad, Date fechaVencimiento) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
    }

    // Getters y Setters
    public T getDescripcion() { return descripcion; }
    public void setDescripcion(T descripcion) { this.descripcion = descripcion; }

    public int getPrioridad() { return prioridad; }
    public void setPrioridad(int prioridad) { this.prioridad = prioridad; }

    public Date getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(Date fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    @Override
    public int compareTo(Tarea<T> otra) {
        return this.fechaVencimiento.compareTo(otra.fechaVencimiento);
    }

    @Override
    public String toString() {
        return "[Prioridad: " + prioridad + "] " + descripcion + " (Vence: " + fechaVencimiento + ")";
    }
}