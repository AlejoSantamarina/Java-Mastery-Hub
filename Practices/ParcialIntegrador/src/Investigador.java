import java.util.ArrayList;

public class Investigador extends Unidad implements Comparable<Investigador> {
    private int nivelExperiencia;
    private double precisionEnCampo;
    private ArrayList<String> especializaciones;

    public Investigador(String nombre, int nivelExperiencia, double precisionEnCampo) {
        super(nombre);
        this.nivelExperiencia = nivelExperiencia;
        this.precisionEnCampo = precisionEnCampo;
        especializaciones = new ArrayList<>();
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public double getPrecisionEnCampo() {
        return precisionEnCampo;
    }

    public ArrayList<String> getEspecializaciones() {
        return especializaciones;
    }

    public void agregarEspecializacion(String especializacion) {
        if(!especializaciones.contains(especializacion)) {
            especializaciones.add(especializacion);
        }
    }

    public int compareTo(Investigador o) {
        int cmp = Integer.compare(this.getNivelExperiencia(), o.getNivelExperiencia());
        if(cmp != 0) return cmp;

        cmp = Double.compare(this.getPrecisionEnCampo(), o.getPrecisionEnCampo());
        if(cmp != 0) return cmp;

        return Integer.compare(this.getEspecializaciones().size(), o.getEspecializaciones().size());
    }

    public Unidad copiarSiCumple(Condicion c) {
        if(c.cumple(this)) {
            Investigador copia = new Investigador(this.getNombre(), this.getNivelExperiencia(), this.getPrecisionEnCampo());
            copia.getEspecializaciones().addAll(this.getEspecializaciones());
            return copia;
        } else {
            return null;
        }
    }
}
