package Punto2;
import java.util.HashMap;
import java.util.Map;
public class PairList<K, V>{
    private Map <K, V> mapaPares;

    public PairList(){
        this.mapaPares = new HashMap<>();
    }

    public void agregar(K clave, V valor){
        mapaPares.put(clave, valor);
    }

    public void eliminar (K clave){
        mapaPares.remove(clave);
    }

    public V obtener (K clave){
        return mapaPares.get(clave);
    }

    @Override
    public String toString() {
        return "PairList: " + mapaPares.toString();
    }
    
}
