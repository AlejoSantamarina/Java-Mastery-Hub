public abstract class ElementoProyecto {
    private String nombre;

    public ElementoProyecto(String nombre) {
        this.nombre = nombre;
    }

    public abstract int getEstimacionHoras();
    public abstract double getCostoPorHora();
    public abstract int contarTareas();
    public abstract ElementoProyecto getCopiaFiltrada(Condicion condicion);

    public String getNombre() {
        return nombre;
    }
}
