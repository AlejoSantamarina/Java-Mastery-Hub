import java.util.Comparator;

public  class ComparadorElementos implements Comparator<Elemento> {

    public int compare(Elemento o1, Elemento o2) {
        if (o1.getId() < o2.getId()) {
            return -1;
        } else {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else {
                if (o1.getFechaDeCompra().isBefore(o2.getFechaDeCompra())) {
                    return -1;
                } else {
                    if (o1.getFechaDeCompra().isAfter(o2.getFechaDeCompra())) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
}
