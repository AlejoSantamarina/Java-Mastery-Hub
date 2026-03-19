public class CalculadorOR implements Calculador {
    private Calculador c1;
    private Calculador c2;

    public CalculadorOR(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(ContingenteEspecial c, ElementoUnidad e) {
        return c1.cumple(c, e) || c2.cumple(c, e);
    }
}
