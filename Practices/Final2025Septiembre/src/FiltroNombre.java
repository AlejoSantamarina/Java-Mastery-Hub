public class FiltroNombre implements Filtro {
    private String nombre;

    public FiltroNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Destino destino) {
        if(destino.getNombre().contains(nombre)) {
            return true;
        }
        return false;
    }
}
