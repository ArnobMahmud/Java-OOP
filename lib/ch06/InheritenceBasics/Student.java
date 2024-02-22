package ch06.InheritenceBasics;

public class Student extends Human {
    long id;
    String university, dept;

    void displayInfo(String name, int age, long id, String university, String dept) {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("University : " + university);
        System.out.println("Department : " + dept);
        System.out.println("ID : " + id);
    }
}