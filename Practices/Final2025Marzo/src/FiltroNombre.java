public class FiltroNombre implements Filtro {
    private String nombre;

    public FiltroNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(InversionSimple inversionSimple) {
        return inversionSimple.getNombre().contains(nombre);
    }
}
