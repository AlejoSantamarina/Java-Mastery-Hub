public class CCondicional implements Calculador {
    private double valorSiCumple;
    private double valorSiNoCumple;
    private Condicion condicion;

    public double calcular(HeroeVolatil heroeVolatil) {
        if(condicion.cumple(heroeVolatil)) {
            return valorSiCumple;
        }
        return valorSiNoCumple;
    }
}
