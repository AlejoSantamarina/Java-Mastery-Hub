import java.util.ArrayList;

public class AE extends ManadasYAlianzas {

    public AE(String nombre) {
        super(nombre);
        listaElementos = new ArrayList<>();
    }

    public int getEnergia() {
        int max = 0;
        for(ElementoAnimal elementoAnimal : listaElementos) {
            int energia = elementoAnimal.getEnergia();
            if(energia > max) {
                max = energia;
            }
        }
        return max;
    }

    public double getAgilidad() {
        if(!listaElementos.isEmpty()) {
            return listaElementos.get(0).getAgilidad();
        }
        return 0;
    }
}
