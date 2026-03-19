public class CondicionEspecializacion implements Condicion {
    private String condicion;

    public CondicionEspecializacion(String condicion) {
        this.condicion = condicion;
    }

    public boolean cumple(Unidad u) {
        return u.getEspecializaciones().contains(condicion);
    }
}
