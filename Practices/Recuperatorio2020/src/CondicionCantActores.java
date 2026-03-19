public class CondicionCantActores implements Condicion {
    private int cantidad;

    public boolean cumple(ElemUn e) {
        return e.getActores().size() > cantidad;
    }
}
