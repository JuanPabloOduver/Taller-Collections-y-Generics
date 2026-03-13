package Punto2;

public class Principal {
    public static void main(String[] args) {
        PairList<String, Double> listaPrecios = new PairList<>();

        listaPrecios.agregar("Laptop", 1200.50);
        listaPrecios.agregar("Mouse", 25.00);
        listaPrecios.agregar("Teclado", 45.99);

        String producto = "Laptop";
        Double precio = listaPrecios.obtener(producto);
        System.out.println("--- Consultando producto ---");
        System.out.println("El precio de " + producto + " es: $" + precio);

        System.out.println("\n--- Eliminando 'Mouse' ---");
        listaPrecios.eliminar("Mouse");
        
        Double precioMouse = listaPrecios.obtener("Mouse");
        System.out.println("¿Existe el Mouse después de eliminar?: " + (precioMouse != null ? precioMouse : "No encontrado"));

        System.out.println("\n--- Inventario final ---");
        System.out.println(listaPrecios);
    }
}