public class FiltroUltValCierre implements Filtro {
    private double ultValCierre;

    public FiltroUltValCierre(double ultValCierre) {
        this.ultValCierre = ultValCierre;
    }

    public boolean cumple(InversionSimple inversionSimple) {
        return inversionSimple.getUltValCierre() > ultValCierre;
    }
}
