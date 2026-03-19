import java.util.ArrayList;

public class HeroeEnmascarado extends Heroe {
    private int divisor;

    public HeroeEnmascarado(String nombre, int poder, double velocidad, int divisor) {
        super(nombre, poder, velocidad);
        this.divisor = divisor;
    }

    public int getPoder() {
        return super.getPoder()/divisor;
    }

    public ArrayList<String> getListaHabilidades() {
        ArrayList<String> listaHabilidadesEnmascarado = new ArrayList<>();
        ArrayList<String> listaHabilidades = super.getListaHabilidades();
        if(!listaHabilidades.isEmpty()) {
            listaHabilidadesEnmascarado.add(listaHabilidades.get(0));
        }
        return listaHabilidadesEnmascarado;
    }
}
