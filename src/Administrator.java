public class Administrator extends Employee{

    public String certificates;

    public Administrator(String name, String surname, String certificates) {
        this.name = name;
        this.surname = surname;
        this.certificates = certificates;
    }

    public void printInfo() {
        System.out.println("Employee name: " + this.name +
                "\nEmployee surname: " + this.surname + "\nEmployee certificates: "
                        + this.certificates);

    }
}
