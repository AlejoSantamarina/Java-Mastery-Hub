public class CondicionAND implements Condicion {
    private Condicion condicion1;
    private Condicion condicion2;

    public CondicionAND(Condicion condicion1, Condicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }

    public boolean cumple(Tarea tarea) {
        return condicion1.cumple(tarea) && condicion2.cumple(tarea);
    }
}