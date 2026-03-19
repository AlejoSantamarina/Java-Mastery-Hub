public class FiltroNOT implements Filtro {
    private Filtro f;

    public FiltroNOT(Filtro f) {
        this.f = f;
    }

    public boolean cumple(InversionSimple inversionSimple) {
        return !f.cumple(inversionSimple);
    }
}
