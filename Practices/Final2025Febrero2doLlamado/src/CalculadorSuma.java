public class CalculadorSuma implements Calculador {
    private Calculador c1;
    private Calculador c2;

    public CalculadorSuma(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double calcular(Elemento elemento) {
        return c1.calcular(elemento) + c2.calcular(elemento);
    }
}
