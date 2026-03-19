import java.util.ArrayList;

public class Heroe extends ElementoDefensa implements Comparable<Heroe> {
    private int poder;
    private double velocidad;
    protected ArrayList<String> listaHabilidades;

    public Heroe(String nombre, int poder, double velocidad) {
        super(nombre);
        this.poder = poder;
        this.velocidad = velocidad;
        listaHabilidades = new ArrayList<>();
    }

    public int getPoder() {
        return poder;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public ArrayList<String> getListaHabilidades() {
        return listaHabilidades;
    }

    public int compareTo(Heroe o) {
        int cmp = o.poder - this.poder;
        if(cmp == 0) {
            cmp = Double.compare(this.velocidad, o.velocidad);
            if(cmp == 0) {
                cmp = this.listaHabilidades.size() - o.listaHabilidades.size();
                return cmp;
            } else {
                return cmp;
            }
        } else {
            return cmp;
        }
    }
}
