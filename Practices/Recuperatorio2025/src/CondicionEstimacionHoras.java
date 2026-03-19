public class CondicionEstimacionHoras implements Condicion {
    private int estimacionHorasMayorA;

    public CondicionEstimacionHoras(int estimacionHorasMayorA) {
            this.estimacionHorasMayorA = estimacionHorasMayorA;
    }

    public boolean cumple(Tarea tarea) {
        return tarea.getEstimacionHoras() > estimacionHorasMayorA;
    }
}
