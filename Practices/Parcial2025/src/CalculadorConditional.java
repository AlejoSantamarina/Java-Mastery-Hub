public class CalculadorConditional implements Calculador {
    private Calculador valorSiCumple, valorSiNoCumple;
    private Filtro f;

    public double calculate(PoniCamaleon poni) {
        if(f.cumple(poni)) {
            return valorSiCumple.calculate(poni);
        }
        return valorSiNoCumple.calculate(poni);
    }
}
