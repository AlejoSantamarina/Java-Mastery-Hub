public class Employee {
    @SensitiveInfo(maskChar = '*', showVisible = true)
    private String name;
    private double salary;
    @SensitiveInfo
    private String socialSecurityNumber;

    public Employee(String name, double salary, String socialSecurityNumber) {
        this.name = name;
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
