public class CondicionActuo implements Condicion {
    private Actor actor;

    public CondicionActuo(Actor actor) {
        this.actor = actor;
    }

    public boolean cumple(ElemUn e) {
        return e.getActores().contains(actor);
    }
}
