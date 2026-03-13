package Punto8;

import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Stack<Integer> miPila = new Stack<>();
        
        for (int i = 1; i <= 10; i++) {
            miPila.push(i);
        }

        System.out.println("Pila original antes de dividir: " + miPila);
        int puntoCorte = 5;

        Pair<Stack<Integer>, Stack<Integer>> resultado = EstructuraUtil.splitStack(miPila, puntoCorte);

        System.out.println("Subpila 1 (Fondo hasta índice " + (puntoCorte-1) + "): " + resultado.getFirst());
        System.out.println("Subpila 2 (Índice " + puntoCorte + " hasta el final): " + resultado.getSecond());
        
    }
}