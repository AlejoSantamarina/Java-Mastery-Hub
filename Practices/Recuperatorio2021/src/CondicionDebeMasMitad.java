public class CondicionDebeMasMitad implements Condicion {

    public boolean cumple(ElementoUnidad elemento) {
        return (elemento.getDeuda() > elemento.getPrecio()/2);
    }
}
