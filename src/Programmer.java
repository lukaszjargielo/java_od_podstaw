public class Programmer extends Employee{

   public String languages;

    public Programmer(String name, String surname, String languages) {
        this.name = name;
        this.surname = surname;
        this.languages = languages;
    }

   public void printInfo() {
       System.out.println("Employee name: " + this.name +
               "\nEmployee surname: " + this.surname + "\nEmployee languages: "
               + this.languages);

    }
}
