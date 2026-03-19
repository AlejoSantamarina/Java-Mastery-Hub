import java.util.ArrayList;

public class Tarea extends ElementoProyecto {
    private ArrayList<String> listaRequisitos;
    private int estimacionHoras;
    private double costoPorHora;

    public Tarea(String nombre, int estimacionHoras, double costoPorHora) {
        super(nombre);
        listaRequisitos = new ArrayList<>();
        this.estimacionHoras = estimacionHoras;
        this.costoPorHora = costoPorHora;
    }

    public void addRequisito(String requisito) {
        listaRequisitos.add(requisito);
    }

    public ArrayList<String> getListaRequisitos() {
        return listaRequisitos;
    }

    public int getEstimacionHoras() {
        return estimacionHoras;
    }

    public double getCostoPorHora() {
        return costoPorHora;
    }

    public int contarTareas() {
        return 1;
    }

    public ElementoProyecto getCopiaFiltrada(Condicion condicion) {
        if(condicion.cumple(this)) {
            Tarea tareaCopia = getInstanciaCopia();
            for(String requisito : listaRequisitos) {
                tareaCopia.addRequisito(requisito);
            }
            return tareaCopia;
        }
        return null;
    }

    public Tarea getInstanciaCopia() {
        Tarea tareaCopia = new Tarea(getNombre(), getEstimacionHoras(), getCostoPorHora());
        return tareaCopia;
    }
}
