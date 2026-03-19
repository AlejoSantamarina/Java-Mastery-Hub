import java.util.ArrayList;

public class InvestigadorNovato extends Investigador {
    private int divisorExperiencia;
    private double reductorPrecision;

    public InvestigadorNovato(String nombre, int nivelExperiencia, double precisionEnCampo, int divisorExperiencia, double reductorPrecision) {
        super(nombre, nivelExperiencia, precisionEnCampo);
        this.divisorExperiencia = nivelExperiencia;
        this.reductorPrecision = reductorPrecision;
    }

    public int getNivelExperiencia() {
        return super.getNivelExperiencia()/divisorExperiencia;
    }

    public double getPrecisionEnCampo() {
        return super.getPrecisionEnCampo()-reductorPrecision;
    }

    public ArrayList<String> getEspecializaciones() {
        String especializacion = super.getEspecializaciones().get(0);
        ArrayList<String> espec = new ArrayList<>();
        espec.add(especializacion);
        return espec;
    }
}
