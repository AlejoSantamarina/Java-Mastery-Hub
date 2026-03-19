public class CSuma implements Calculador {
    private Calculador calculador1;
    private Calculador calculador2;

    public CSuma(Calculador calculador1, Calculador calculador2) {
        this.calculador1 = calculador1;
        this.calculador2 = calculador2;
    }

    public double calcular(AnimalVersatil animalVersatil) {
        return calculador1.calcular(animalVersatil) + calculador2.calcular(animalVersatil);
    }
}
