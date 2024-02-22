/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* Encapsulation */

package ch05;

public class EncapsulationTest {
    public static void main(String[] args) {

        Encapsulation encap = new Encapsulation();
        
        encap.setName("Arnob Mahmud");
        encap.setAge(23);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age  : " + encap.getAge());
    }
}
