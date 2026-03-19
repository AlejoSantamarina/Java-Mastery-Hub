public class InvestigadorExageradoElite extends Investigador {
    private int duplicador;

    public InvestigadorExageradoElite(String nombre, int nivelExperiencia, double precisionEnCampo, int duplicador) {
        super(nombre, nivelExperiencia, precisionEnCampo);
        this.duplicador = duplicador;
    }

    public int getNivelExperiencia() {
        return super.getNivelExperiencia() * duplicador;
    }

    public double getPrecisionEnCampo() {
        return super.getPrecisionEnCampo() * duplicador;
    }
}
