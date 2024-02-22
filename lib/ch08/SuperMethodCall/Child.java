package ch08.SuperMethodCall;

public class Child extends Parent {

    @Override
    void displayText() {
        super.displayText(); // parent class\'s method
        System.out.println("I'm from child class.");
    }
}