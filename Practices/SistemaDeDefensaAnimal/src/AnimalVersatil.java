public class AnimalVersatil extends Animal {
    private Calculador calculador;

    public AnimalVersatil(String nombre, int energia, double agilidad, Calculador calculador) {
        super(nombre, energia, agilidad);
        this.calculador = calculador;
    }

    public double getAgilidad() {
        return calculador.calcular(this);
    }
}
