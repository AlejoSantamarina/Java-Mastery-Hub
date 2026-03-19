import java.util.ArrayList;

public class PoniRebeldeYGruñon extends Poni {
    private int divisorPoderMagico;
    private double reductorVelocidad;
    private int indiceHab;

    public PoniRebeldeYGruñon(String nombre, int poderMagico, double velocidad) {
        super(nombre, poderMagico, velocidad);
    }

    public ArrayList<String> getHabilidades (ElementoPoni e) {
        ArrayList<String> soloNesima = new ArrayList<>();
        ArrayList<String> habilidades = super.getHabilidades();
        if(indiceHab >= habilidades.size()) {
            return soloNesima;
        }
        soloNesima.add(habilidades.get(indiceHab));
        return soloNesima;
    }
}
