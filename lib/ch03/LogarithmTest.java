/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* Math {Exponential, Logarithm} */

package ch03;

import java.util.Scanner;

public class LogarithmTest {
    public static void main(String[] args) {

        double num;
        System.out.println("Enter value : ");

        try (Scanner input = new Scanner(System.in)) {
            num = input.nextDouble();
        }
        Logarithm log = new Logarithm();

        System.out.println("log(" + num + ") = " + log.logResult(num));
        System.out.println("exp(" + num + ") = " + log.expResult(num));
    }
}