package ch09.Abstraction;

public class User1 extends MobileUser {

    @Override
    void sendMessage() {
        System.out.println("I'm user 1.");
    }
}