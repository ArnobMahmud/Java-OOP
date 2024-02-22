/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* Private Access */

package ch06.PrivateAccess;

public class InheritanceTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Arnob Mahmud");
        student.setAge(23);
        student.setId(202012047);
        student.setUniversity("BUTEX");
        student.setDept("Fabric Engineering");

        System.out.println("Name : " + student.getName());
        System.out.println("Age : " + student.getAge());
        System.out.println("University : " + student.getUniversity());
        System.out.println("Department : " + student.getDept());
        System.out.println("ID : " + student.getId());
    }
}