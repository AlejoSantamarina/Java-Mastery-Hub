public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alejo", 2000, "46429424");
        SecurityEngine securityEngine = new SecurityEngine();
        SecurityEngine.maskData(employee1);
    }
}