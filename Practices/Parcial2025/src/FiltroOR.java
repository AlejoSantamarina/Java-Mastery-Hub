public class FiltroOR implements Filtro {
    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroOR(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    public boolean cumple(Poni poni) {
        return filtro1.cumple(poni) || filtro2.cumple(poni);
    }
}
