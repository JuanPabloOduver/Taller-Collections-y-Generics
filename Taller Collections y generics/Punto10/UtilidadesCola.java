package Punto10;

import java.util.LinkedList;
import java.util.Queue;

public class UtilidadesCola {

  
    public static <T> Queue<T> mergeQueues(Queue<T> cola1, Queue<T> cola2) {
        Queue<T> resultado = new LinkedList<>();

        while (!cola1.isEmpty() || !cola2.isEmpty()) {
            
            if (!cola1.isEmpty()) {
                resultado.add(cola1.poll());
            }
            
            if (!cola2.isEmpty()) {
                resultado.add(cola2.poll());
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        Queue<Integer> c1 = new LinkedList<>();
        c1.add(1); c1.add(3); c1.add(5);

        Queue<Integer> c2 = new LinkedList<>();
        c2.add(2); c2.add(4); c2.add(6);

        Queue<Integer> fusionada = mergeQueues(c1, c2);
        System.out.println(fusionada); // Salida: [1, 2, 3, 4, 5, 6]
    }
}
