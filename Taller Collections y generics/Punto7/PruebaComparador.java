package Punto7;

public class PruebaComparador {
    public static void main(String[] args) {
        Comparador<Integer> compInt = new ComparadorGeneral<>();
        System.out.println("Comparamos 1 y 2" + compInt.comparar(10,20));

        Comparador<String> compString = new ComparadorGeneral<>();
        System.err.println("Comparamos a y b" + compString.comparar("a", "b"));
    }
}
