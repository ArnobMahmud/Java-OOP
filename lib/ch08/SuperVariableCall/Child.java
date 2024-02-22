package ch08.SuperVariableCall;

public class Child extends Parent {
    // int age = 40;
    int age = 20; // same variable as parent class

    void displayAge() {
        System.out.println(age); // will print 20 not 40
        System.out.println(super.age); // will print 40
    }
}