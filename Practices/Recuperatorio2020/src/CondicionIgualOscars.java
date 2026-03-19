public class CondicionIgualOscars implements Condicion {
    private int oscars;

    public CondicionIgualOscars(int oscars) {
        this.oscars = oscars;
    }

    public boolean cumple(ElemUn e) {
        return e.getOscars() == oscars;
    }
}
