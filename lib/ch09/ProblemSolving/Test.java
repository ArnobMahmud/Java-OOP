/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* Abstraction Problem Solving */

package ch09.ProblemSolving;

public class Test {
    public static void main(String[] args) {
        Shape sh;

        sh = new Rectangle(10, 10);
        sh.area();

        sh = new Triangle(20, 5);
        sh.area();

        sh = new Circle(20);
        sh.area();
    }
}
