public class CondicionNOT implements Condicion {
    private Condicion condicion;

    public CondicionNOT(Condicion condicion) {
        this.condicion = condicion;
    }

    public boolean cumple(Tarea tarea) {
        return !condicion.cumple(tarea);
    }
}