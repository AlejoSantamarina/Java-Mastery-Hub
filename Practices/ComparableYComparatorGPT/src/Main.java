import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<Libro>();
        Libro libro1 = new Libro("Watsup", "Jonny deep", 1990);
        Libro libro2 = new Libro("Hisenberg", "Indiana Johns", 2001);
        Libro libro3 = new Libro("Dexter", "Walter White", 1870);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);

        Collections.sort(libros);
        for(Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getAnioPublicacion());
        }

        System.out.println(libro1.compareTo(libro2));
    }
}