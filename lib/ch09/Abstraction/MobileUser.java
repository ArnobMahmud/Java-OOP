package ch09.Abstraction;

public abstract class MobileUser {
   abstract void sendMessage();

   void call() {
      System.out.println("Calling...");
   }
}