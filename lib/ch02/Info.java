package ch02;

public class Info {
    String name, dept, university, gender;
    int age;
    long id, phone;

    Info() {
        System.out.println("No Data!" + "\n");
    }

    Info(String name, String university, String dept, long id) {
        this.name = name;
        this.dept = dept;
        this.id = id;
        this.university = university;
    }

    Info(int age, String gender, long phone) {
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }

    void displayInfo1() {
        System.out.println("Age : " + age + "\n" + "Gender : " + gender + "\n" + "Phone : " + phone + "\n");
    }

    void displayInfo2() {
        System.out.println("Name : " + name + "\n" + "University : " + university + "\n" + "Department : " + dept + "\n"
                + "ID : " + id + "\n");
    }
}