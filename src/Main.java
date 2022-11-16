public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.printInfo();
        System.out.println();
        Administrator administrator = new Administrator ("Tymoteusz",
                "Zielinski","Web master");
        administrator.printInfo();
        System.out.println();
        Programmer programmer = new Programmer("Adam","Piasecki","Azure");
        programmer.printInfo();
    }
}
