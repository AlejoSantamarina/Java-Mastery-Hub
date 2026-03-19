public class InvestigadorAdaptativo extends Investigador {
    private Calculador calculador;

    public InvestigadorAdaptativo(String nombre, int nivelExperiencia, double precisionEnCampo, Calculador calculador) {
        super(nombre, nivelExperiencia, precisionEnCampo);
        this.calculador = calculador;
    }

    public double getPrecisionEnCampo() {
        return calculador.calcular(this);
    }
}
