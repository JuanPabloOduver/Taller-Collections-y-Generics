package Punto8;

import java.util.Stack;

public class EstructuraUtil {

  
    public static Pair<Stack<Integer>, Stack<Integer>> splitStack(Stack<Integer> s, int i) {
        Stack<Integer> subPila1 = new Stack<>();
        Stack<Integer> subPila2 = new Stack<>();
        Stack<Integer> aux = new Stack<>();

        while (!s.isEmpty()) {
            aux.push(s.pop());
        }

        int contador = 0;
        int tamañoOriginal = aux.size();

        while (!aux.isEmpty()) {
            Integer elemento = aux.pop();
            if (contador < i) {
                subPila1.push(elemento); 
            } else {
                subPila2.push(elemento); 
            }
            contador++;
        }

        return new Pair<>(subPila1, subPila2);
    }
}