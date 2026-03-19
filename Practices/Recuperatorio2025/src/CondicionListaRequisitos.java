public class CondicionListaRequisitos implements Condicion {
    private String requisito;

    public CondicionListaRequisitos(String requisito) {
        this.requisito = requisito;
    }

    public boolean cumple(Tarea tarea) {
        return tarea.getListaRequisitos().contains(requisito);
    }
}
