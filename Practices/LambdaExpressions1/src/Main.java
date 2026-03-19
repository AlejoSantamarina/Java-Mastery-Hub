import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listExample = new ArrayList<>();
        listExample.add("Alejo");
        listExample.add("Pedro");
        listExample.add("Juan");
        listExample.add("Alex");
        listExample.add("Sebastian");
        listExample.add("Mateo");
        listExample.add("Rodrigo");
        listExample.add("Alfonso");

        MyList myList = new MyList(listExample);

        Filter filter = myList::filter;

        char letter = 'A';
        ArrayList<String> filteredList = filter.filter(letter);

        System.out.println("Nombres que empiezan con " + letter + ": ");
        for(String name : filteredList) {
            System.out.println(name);
        }
    }
    //Estoy enlazando un método de una clase a una interfaz funcional usando :: y ejecutándolo desde ahí.
}
