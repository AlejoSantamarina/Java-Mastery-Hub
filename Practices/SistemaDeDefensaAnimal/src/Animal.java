import java.util.ArrayList;

public class Animal extends ElementoAnimal {
    private int energia;
    private double agilidad;
    private ArrayList<String> habilidades;

    public Animal(String nombre, int energia, double agilidad) {
        super(nombre);
        this.energia = energia;
        this.agilidad = agilidad;
        habilidades = new ArrayList<>();
    }

    public int getEnergia() {
        return energia;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }
}
