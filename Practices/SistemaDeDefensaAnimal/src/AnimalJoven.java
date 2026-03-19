import java.util.ArrayList;

public class AnimalJoven extends Animal {
    private int divisor;

    public AnimalJoven(String nombre, int energia, double agilidad, int divisor) {
        super(nombre, energia, agilidad);
        this.divisor = divisor;
    }

    public int getEnergia() {
        return super.getEnergia()/divisor;
    }

    public ArrayList<String> getHabilidades() {
        ArrayList<String> habilidades = new ArrayList<>();
        if(!super.getHabilidades().isEmpty()) {
            ArrayList<String> aux = super.getHabilidades();
            habilidades.add(aux.get(0));
        }
        return habilidades;
    }
}
