/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

package ch09.Phone;

public class Phone {
    public static void main(String[] args) {
        XPhone xp = new ZPhone();
        xp.call();
        xp.dance();
        xp.swim();
        xp.walk();
    }
}

abstract class XPhone { // abstract class
    public void call() {
        System.out.println("Calling...");
    }

    public abstract void walk(); // no implementation

    public abstract void swim();

    public abstract void dance();
}

class YPhone extends XPhone { // abstract class

    @Override
    public void swim() {
    }

    @Override
    public void dance() {
    }

    public void walk() {
        System.out.println("Walking...");
    }

}

class ZPhone extends YPhone { // concrete class

    public void swim() {
        System.out.println("Swimming...");
    }

    public void dance() {
        System.out.println("Dancing...");
    }
}