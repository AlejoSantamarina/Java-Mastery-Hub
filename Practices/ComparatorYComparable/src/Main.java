import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creo la lista de personas
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Ana", 25, 1.65));
        personas.add(new Persona("Luis", 30, 1.80));
        personas.add(new Persona("Maria", 22, 1.70));
        personas.add(new Persona("Pedro", 30, 1.75));

        System.out.println("Lista original:");
        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }

        // Orden natural (Comparable) → por edad ascendente
        Collections.sort(personas);
        System.out.println("\nPor edad (ascendente - Comparable):");
        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }

        // Edad descendente (orden natural invertido)
        Collections.sort(personas, Collections.reverseOrder());
        System.out.println("\nPor edad (descendente - reverseOrder):");
        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }

        // Comparator por nombre ascendente
        Collections.sort(personas, new ComparadorPorNombre());
        System.out.println("\nPor nombre (ascendente - Comparator):");
        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }

        // Comparator por nombre descendente (reverseOrder con Comparator)
        Collections.sort(personas, Collections.reverseOrder(new ComparadorPorNombre()));
        System.out.println("\nPor nombre (descendente - reverseOrder con Comparator):");
        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }

        // Comparator por altura (mayor a menor según cómo lo definiste)
        Collections.sort(personas, new ComparadorPorAltura());
        System.out.println("\nPor altura (Comparator):");
        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }
    }
}