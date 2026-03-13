package Punto4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Repositorio<T> implements Iterable<T> {

    private List<T> elementos;

    public Repositorio() {
        this.elementos = new ArrayList<>();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T obtener(int indice) {
        return elementos.get(indice);
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorRepositorio();
    }
 
    private class IteradorRepositorio implements Iterator<T> {
        private int posicion = 0;

        @Override
        public boolean hasNext() {
            return posicion < elementos.size();
        }

        @Override
        public T next() {
            return elementos.get(posicion++);
        }
    }

    /**
     * MECANISMO PERSONALIZADO: Recorrido de atrás hacia adelante.
     * Se implementa retornando un Iterable anónimo o una clase que
     * proporcione un Iterator con lógica inversa.
     */
    public Iterable<T> reverso() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return new Iterator<T>() {
                    private int posicion = elementos.size() - 1;

                    @Override
                    public boolean hasNext() {
                        return posicion >= 0;
                    }

                    @Override
                    public T next() {
                        return elementos.get(posicion--);
                    }
                };
            }
        };
    }
}