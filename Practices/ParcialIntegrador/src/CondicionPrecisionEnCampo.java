public class CondicionPrecisionEnCampo implements Condicion {
    private double precisionMenorOIgualA;

    public CondicionPrecisionEnCampo(double precisionMenorOIgualA) {
        this.precisionMenorOIgualA = precisionMenorOIgualA;
    }

    public boolean cumple(Unidad u) {
        return u.getPrecisionEnCampo() <= precisionMenorOIgualA;
    }
}
