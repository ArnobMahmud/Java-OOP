package ch04.Restrictions;

public class StaticMethodRestriction {
    void NonStaticMethod() { // non static method
        StaticMethod1(); // -> static method can be called inside of a non static method!
        System.out.println("I'm a non static method");
    }

    static void StaticMethod1() { // static method
        // NonStaticMethod(); -> Error. non static method can't be called inside of a static method!
        System.out.println("I'm static method 1");
    }

    static void StaticMethod2() { // static method
        StaticMethod1(); // -> static method can be called inside of a static method!
        System.out.println("I'm static method 2");
    }
}