package ch09.Abstraction;

public class User2 extends MobileUser {

    @Override
    void sendMessage() {
        System.out.println("I'm user 2.");
    }
}
