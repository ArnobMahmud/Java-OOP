package ch07;

public class Student extends Human {
    String uni, dept;
    long id;

    @Override
    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("University : " + uni);
        System.out.println("Department : " + dept);
        System.out.println("ID : " + id);
    }
}
