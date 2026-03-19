import java.util.ArrayList;

public class Poni extends ElementoPoni implements Comparable<Poni>{
    private int poderMagico;
    private double velocidad;
    private ArrayList<String> habilidades;

    public Poni(String nombre, int poderMagico, double velocidad) {
        super(nombre);
        this.poderMagico = poderMagico;
        this.velocidad = velocidad;
        habilidades = new ArrayList<>();
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public int getCantidad(Filtro f) {
        if (f.cumple(this)) {
            return 1;
        }
        return 0;
    }

    public int compareTo(Poni other) {
        int cmp = Integer.compare(other.getPoderMagico(), this.getPoderMagico());
        if(cmp != 0) {
            return cmp;
        }
        cmp = Double.compare(other.getVelocidad(), this.getVelocidad());
        if(cmp != 0) {
            return cmp;
        }
        return Integer.compare(other.getHabilidades().size(), this.getHabilidades().size());
    }
}
