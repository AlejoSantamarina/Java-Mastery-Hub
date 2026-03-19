public class CalculadorPorEspecializacion implements Calculador {
    private String especializacion;
    private double precisionSiCumple;
    private double precisionSiNoCumple;

    public double calcular(Investigador i) {
        if(i.getEspecializaciones().contains(especializacion)) {
            return precisionSiCumple;
        }
        return precisionSiNoCumple;
    }
}
