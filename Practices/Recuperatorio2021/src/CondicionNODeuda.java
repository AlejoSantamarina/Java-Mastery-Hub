public class CondicionNODeuda implements Condicion {

    public boolean cumple(ElementoUnidad elemento) {
        return elemento.getDeuda() == 0;
    }
}
