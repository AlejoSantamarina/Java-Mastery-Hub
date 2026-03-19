public class CFijo implements Calculador {
    private double valorFijo;

    public CFijo(double valorFijo) {
        this.valorFijo = valorFijo;
    }

    public double calcular(AnimalVersatil animalVersatil) {
        return valorFijo;
    }
}
