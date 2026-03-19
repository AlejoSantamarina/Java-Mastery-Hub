public class CalculadorNOT implements Calculador {
    private Calculador calculador;

    public CalculadorNOT(Calculador calculador) {
        this.calculador = calculador;
    }

    public boolean cumple(ContingenteEspecial c, ElementoUnidad e) {
        return !calculador.cumple(c, e);
    }
}
