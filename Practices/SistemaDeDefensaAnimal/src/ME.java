import java.util.ArrayList;

public class ME extends ManadasYAlianzas {

    public ME(String nombre) {
        super(nombre);
        listaElementos = new ArrayList<>();
    }

    public int getEnergia() {
        int energia = 0;
        for(ElementoAnimal elementoAnimal : listaElementos) {
            energia += elementoAnimal.getEnergia();
        }
        return energia;
    }

    public double getAgilidad() {
        double max = 0.0;
        for(ElementoAnimal elementoAnimal : listaElementos) {
            double agilidad = elementoAnimal.getAgilidad();
            if(agilidad > max) {
                max = agilidad;
            }
        }
        return max;
    }
}
