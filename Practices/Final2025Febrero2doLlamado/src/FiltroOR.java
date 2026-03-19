public class FiltroOR implements Filtro {
    private Filtro filtro1;
    private Filtro filtro2;

    public FiltroOR(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    public boolean cumple(Elemento elemento) {
        return filtro1.cumple(elemento) || filtro2.cumple(elemento);
    }
}
