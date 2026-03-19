//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Finder finder = String::indexOf;
        System.out.println(finder.find("Hola", "Hola mundo"));

        Converter converter = new Converter();
        Deserializer deserializer = converter::convert;
        System.out.println(deserializer.deserialize("12345"));

        Verifier verifier = Utilities::isEmpty;
        System.out.println(verifier.verify(""));
    }
}