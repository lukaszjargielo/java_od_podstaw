public class Student {

    String name;
    String surname;
    String city;
    int age;

    public Student() {
        this.name = "Sucker";
        this.surname = "Donkey";
        this.city = "Sosnowiec";
        this.age = 101;
    }

    public Student(String name, String surname,
                   String city, int age) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;

    }
     public void printBasicData() {
         System.out.println("Name: " + name + "\nSurname: " + surname +
                 "\nCity: " + city + "\nAge: " + age);
     }
}
