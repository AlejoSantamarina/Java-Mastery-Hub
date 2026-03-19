public class FiltroAND implements Filtro {
    private Filtro f1;
    private Filtro f2;

    public FiltroAND(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean cumple(InversionSimple inversionSimple) {
        return f1.cumple(inversionSimple) && f2.cumple(inversionSimple);
    }
}
