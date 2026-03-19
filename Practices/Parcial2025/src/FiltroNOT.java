public class FiltroNOT implements Filtro {
    private Filtro filtro;

    public FiltroNOT(Filtro filtro) {
        this.filtro = filtro;
    }

    public boolean cumple(Poni poni) {
        return !filtro.cumple(poni);
    }
}
