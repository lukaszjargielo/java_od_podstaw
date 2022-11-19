package com.example.oop.basics.inheritance.polymorphism_casting;
class Employee {
    private String name;
    private String jobTitle;
    private float salary;

    public Employee() {
        name = "uknown";
        jobTitle = "unknown";
        salary = 4000.0f;
    }

    public Employee(String name, String jobTitle, float salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void doWork() {
        System.out.println("Doing elementary work.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Employee: " + name);
    }
}

class Manager extends Employee{
    private String departmentName;

    public void hireEmployee() {
        System.out.println("Employee hired!");
    }

    public void giveRise(Employee employee) {
        System.out.println("Employee got rise!");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Manager() {
     departmentName =  "unknown";
    }

    public Manager(String name, String jobTitle, float salary, String departmentName) {
        super(name, jobTitle, salary);
        this.departmentName = departmentName;
    }

    public void printInfo() {
        System.out.println("Manager: " + getName());
    }
}

class Ceo extends Manager {
    private int sharesNumber;

    public void signContract() {
        System.out.println("Contract signed!");
    }

    public int getSharesNumber() {
        return sharesNumber;
    }

    public void setSharesNumber(int sharesNumber) {
        this.sharesNumber = sharesNumber;
    }

    public Ceo() {
        sharesNumber = 100;
    }

    public Ceo(String name, String jobTitle, float salary, String departmentName, int sharesNumber) {
        super(name, jobTitle, salary, departmentName);
        this.sharesNumber = sharesNumber;
    }


    public void printInfo() {
        System.out.println("Ceo: " + getName());
    }
}

public class CompanyCastingExample {
    public static void main(String[] args) {
        Employee employee = new Employee("George", "Programmer", 10000.0f);
        Manager manager = new Manager("Anna", "Team leader", 8000.0f, "HR");
        Employee employeeCeo = new Ceo("John", "President", 20000.0f, "Board",100);

//        ((Ceo) employeeCeo).signContract(); Worse way - only if we are sure
        // that employeeCeo is instance of Ceo
if(employeeCeo instanceof Ceo) { // Better way - we don't have to be sure
    Ceo ceo = (Ceo) employeeCeo;
    ceo.signContract();

    if(employeeCeo instanceof Ceo) {
//        ceo = (Ceo) employeeCeo;
//        ceo.signContract();
        ((Ceo) employeeCeo).signContract(); // or

        System.out.println(manager instanceof Ceo);
        System.out.println(ceo instanceof Manager);// true beacuse Ceo inherits from Manager
    }
}


    }
}
