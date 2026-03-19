public class AnimalMutante extends Animal {
    private int multiplicador;

    public AnimalMutante(String nombre, int energia, double agilidad, int multiplicador) {
        super(nombre, energia, agilidad);
        this.multiplicador = multiplicador;
    }

    public int getEnergia() {
        return super.getEnergia()*multiplicador;
    }

    public double getAgilidad() {
        return super.getAgilidad()*multiplicador;
    }
}
