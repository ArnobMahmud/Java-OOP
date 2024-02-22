package ch01;

public class Info {
    String name;
    String dept;
    long id;
    String university;

    Info(String name, String university, String dept, long id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
        this.university = university;
    }

    void displayInfo() {
        System.out.println("Name : " + name + "\n" + "University : " + university + "\n" + "Department : " + dept + "\n"
                + "ID : " + id + "\n");
    }
}