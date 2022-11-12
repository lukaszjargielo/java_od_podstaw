public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.printBasicData();
        System.out.println();

        Student student2 = new Student();
        student2.name = "Robert C.";
        student2.surname = "Martin";
        student2.city = "Texas City";
        student2.age = 69;
        student2.printBasicData();
        System.out.println();

        Student student3 = new Student("Bruce", "Eckle", "Las Vegas",
                65);
        student3.printBasicData();
    }
}
