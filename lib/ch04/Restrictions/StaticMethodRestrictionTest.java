/*
    author : Arnob Mahmud

    mail : arnob.tech.me@gmail.com
*/

/* static methods restriction */

package ch04.Restrictions;

public class StaticMethodRestrictionTest {
    public static void main(String[] args) {
        StaticMethodRestriction rest = new StaticMethodRestriction();
        rest.NonStaticMethod();
        
        StaticMethodRestriction.StaticMethod1();
        StaticMethodRestriction.StaticMethod2();
    }
}
