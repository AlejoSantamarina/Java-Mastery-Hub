public class CondicionCostoPorHora implements Condicion {
    private double costoPorHoraMayorA;

    public CondicionCostoPorHora(double costoPorHoraMayorA) {
        this.costoPorHoraMayorA = costoPorHoraMayorA;
    }

    public boolean cumple(Tarea tarea) {
        return tarea.getCostoPorHora() > costoPorHoraMayorA;
    }
}
