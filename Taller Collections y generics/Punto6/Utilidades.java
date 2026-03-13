package Punto6;
import java.util.Arrays;
import java.util.List;



 // Crea un método genérico llamado maximo que reciba una lista de objetos 
 // de cualquier tipo que implemente la interfaz Comparable y retorne el objeto máximo.


public class Utilidades {

public static <T extends Comparable<T>> T maximo (List<T> lista){
    if (lista == null || lista.isEmpty()){
        return null;
    }

    T max = lista.get(0);

    for (T elemento : lista) {
        if (elemento.compareTo(max) > 0 ){
            max = elemento;
        }
    }
    return max;
}

    public static void main(String[] args) {
        List<Integer> listaNum = Arrays.asList(1,2,3,4,5);
        Integer maxNum = maximo(listaNum);
        System.out.println(maxNum);
        
        List<String> listaPal = Arrays.asList("hola", "holaa", "holaaaaaaa", "z");
        String maxPal = maximo(listaPal);
        System.out.println(maxPal);

    }
}