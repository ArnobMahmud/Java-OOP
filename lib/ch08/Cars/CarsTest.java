/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* Constructors, Super, Method Override */

package ch08.Cars;

public class CarsTest {
    public static void main(String[] args) {

        Cars car1 = new Cars(155, 6000, " Mercedes-Benz");
        Cars car2 = new Cars(200, 4300, " BMW");
        Cars car3 = new Cars(250, 5400, " Tesla");

        car1.displayData();
        car2.displayData();
        car3.displayData();
    }
}
