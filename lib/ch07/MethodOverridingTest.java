/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* Method Override */

package ch07;

public class MethodOverridingTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "Arnob Mahmud";
        student.age = 23;
        student.uni = "BUTEX";
        student.dept = "Fabric Engineering";
        student.id = 202012047;

        Human human = new Human();
        human.name = "Arnob Mahmud";
        human.age = 23;

        student.displayInfo();
        human.displayInfo();
    }
}
