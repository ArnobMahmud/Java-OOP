/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* Abstraction */

package ch09.Abstraction;

public class AbstractionTest {
    public static void main(String[] args) {

        MobileUser mu; // abstract class reference

        mu = new User1();
        mu.sendMessage();
        mu.call();

        mu = new User2();
        mu.sendMessage();
        mu.call();
    }
}
