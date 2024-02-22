/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* static variable */

package ch04;

public class StaticVariableTest {
    public static void main(String[] args) {

        StaticVariable stat = new StaticVariable(); // object create for non static var
        System.out.println(stat.district);

        System.out.println(StaticVariable.university); // needn't to create obj to call. call by Class name
    }
}