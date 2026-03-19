public class CondicionMinimoOscars implements Condicion {
    private int oscars;

    public CondicionMinimoOscars(int oscars) {
        this.oscars = oscars;
    }

    public boolean cumple(ElemUn e) {
        return e.getOscars() > oscars;
    }
}
