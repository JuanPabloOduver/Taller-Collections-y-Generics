package Punto7;

public class ComparadorGeneral<T extends Comparable<T>> implements Comparador<T> {
    public int comparar(T a, T b){
        return a.compareTo(b);
    }
}
