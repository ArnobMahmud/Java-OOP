/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* InstanceOf */

package ch06.InstanceOf;

public class Test {
    public static void main(String[] args) {
        Country con = new Country();
        Disctrict dis = new Disctrict();
        City ct = new City();

        System.out.println(con instanceof Country); // -> true
        System.out.println(dis instanceof Country); // -> true
        System.out.println(ct instanceof Country); // -> true
        System.out.println(dis instanceof Disctrict); // -> true
        System.out.println(ct instanceof Disctrict); // -> true
        System.out.println(ct instanceof City); // -> true

        System.out.println(dis instanceof City); // -> false
        System.out.println(con instanceof Deprecated); // -> false
        System.out.println(con instanceof City); // -> false

    }
}
