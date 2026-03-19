import java.util.ArrayList;

public class TareaConsultoriaEspecializada extends Tarea {
    private double valorSiCumple;
    private double valorSiNoCumple;
    private Condicion condicion;

    public TareaConsultoriaEspecializada(String nombre, int estimacionHoras, double costoPorHora) {
        super(nombre, estimacionHoras, costoPorHora);
    }

    public double getCostoPorHora() {
        if(condicion.cumple(this)) {
            return valorSiCumple;
        }
        return valorSiNoCumple;
    }

    public Tarea getInstanciaCopia() {
        TareaConsultoriaEspecializada tareaConsultoriaEspecializada = new TareaConsultoriaEspecializada(getNombre(), getEstimacionHoras(), getCostoPorHora());
        return tareaConsultoriaEspecializada;
    }

}
