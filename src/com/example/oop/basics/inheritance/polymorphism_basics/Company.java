package com.example.oop.basics.inheritance.polymorphism_basics;
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

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee("George", "Programmer", 10000.0f);
        Manager manager = new Manager("Anna", "Team leader", 8000.0f, "HR");
        Ceo ceo = new Ceo("John", "President", 20000.0f, "Board",100);
        Employee worker = ceo; //example of polymorphism
        worker.doWork(); // only available methods from basic type
        worker.printInfo(); // Dynamic binding - we got Ceo object in reference.
        Manager person  = ceo; //example of polymorphism
        person.printInfo(); // dynamic binding
        person.doWork();
        //worker.signContract(); we need converting .Employee into .Ceo
//        ceo = (Ceo) worker;
        ((Ceo) worker).signContract();
        person.giveRise(worker);// We got methods from basic and derived class(Manager)
        //We got 3 references to ceo, each of them has got another type

    }
}
