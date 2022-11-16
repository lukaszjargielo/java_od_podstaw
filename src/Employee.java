public class Employee {
   public String name;
   public String surname;

    public Employee() {
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void printInfo() {
        System.out.println("Employee name: " + this.name +
                "\nEmployee surname: " + this.surname);
    }
}
