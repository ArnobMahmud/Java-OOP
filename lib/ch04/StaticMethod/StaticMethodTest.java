/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* static method */

package ch04.StaticMethod;

public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethod staticmethod = new StaticMethod();
        staticmethod.welcomeText(); // non static

        StaticMethod.Intro(); // static
    }
}
